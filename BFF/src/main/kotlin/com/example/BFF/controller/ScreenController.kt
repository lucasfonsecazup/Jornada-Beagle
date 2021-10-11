package com.example.BFF.controller

import com.example.BFF.service.ScreenBeagleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ScreenController(
    private val screenBeagleService: ScreenBeagleService
) {
    @GetMapping("/screen")
    fun getFirstScreen() = screenBeagleService.createScreenBeagle()
}