package com.example.BFF.service

import com.example.BFF.builder.ScreenBeagleBuilder
import org.springframework.stereotype.Service

@Service
class ScreenBeagleService {
    fun createScreenBeagle() = ScreenBeagleBuilder
}