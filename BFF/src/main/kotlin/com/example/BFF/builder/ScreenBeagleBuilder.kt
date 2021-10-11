package com.example.BFF.builder

import br.com.zup.beagle.ext.setFlex
import br.com.zup.beagle.ext.setStyle
import br.com.zup.beagle.widget.action.Alert
import br.com.zup.beagle.widget.action.Navigate
import br.com.zup.beagle.widget.action.Route
import br.com.zup.beagle.widget.core.AlignSelf
import br.com.zup.beagle.widget.core.EdgeValue
import br.com.zup.beagle.widget.core.TextInputType
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder
import br.com.zup.beagle.widget.ui.Button
import br.com.zup.beagle.widget.ui.Text
import br.com.zup.beagle.widget.ui.TextInput

object ScreenBeagleBuilder : ScreenBuilder {
    override fun build() = Screen(
        child = Container(
            children = listOf(
                Text(
                    text = "Hello Beagle!",
                    textColor = "#008000"
                ).setStyle {
                    margin = EdgeValue.only(top = 16)
                }.setFlex {
                    alignSelf = AlignSelf.CENTER
                },
                Button(
                    text = "Clique aqui",
                    onPress = listOf(
                        Navigate.PushView(
                            Route.Local(
                                Screen(
                                    child = Container(
                                        children = listOf(
                                        Text("Hello second Screen"),
                                            Button(
                                                text = "Voltar",
                                                onPress = listOf(
                                                        Navigate.PopView()
                                                    )
                                                )
                                            )
                                    )
                                )
                            )
                        )
                    )
                )
            )
        )
    )
}