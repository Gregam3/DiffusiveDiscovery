package dev.gregmitten.api

import com.google.gson.Gson
import dev.gregmitten.model.dto.Prompt

class Txt2ImageRequest(
    val prompt: Prompt,
) {
    fun makeFullRequest(): Map<*, *> {
        val jsonString = """
            {
              "enable_hr": false,
              "denoising_strength": 0,
              "firstphase_width": 0,
              "firstphase_height": 0,
              "hr_scale": 2,
              "hr_upscaler": "string",
              "hr_second_pass_steps": 0,
              "hr_resize_x": 0,
              "hr_resize_y": 0,
              "prompt": "$prompt",
              "styles": [
                "string"
              ],
              "seed": -1,
              "subseed": -1,
              "subseed_strength": 0,
              "seed_resize_from_h": -1,
              "seed_resize_from_w": -1,
              "sampler_name": "string",
              "batch_size": 1,
              "n_iter": 1,
              "steps": 50,
              "cfg_scale": 7,
              "width": 512,
              "height": 512,
              "restore_faces": false,
              "tiling": false,
              "negative_prompt": "string",
              "eta": 0,
              "s_churn": 0,
              "s_tmax": 0,
              "s_tmin": 0,
              "s_noise": 1,
              "override_settings": {},
              "override_settings_restore_afterwards": true,
              "script_args": [],
              "sampler_index": "Euler",
              "script_name": "string"
            }
        """.trimIndent()

        return Gson().fromJson(jsonString, Map::class.java)
    }

}