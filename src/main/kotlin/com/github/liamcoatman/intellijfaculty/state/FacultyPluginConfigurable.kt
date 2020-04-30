package com.github.liamcoatman.intellijfaculty.state

import com.intellij.openapi.Disposable
import com.intellij.openapi.options.Configurable
import com.intellij.openapi.options.Configurable.NoScroll
import com.intellij.openapi.ui.ComboBox
import javax.swing.JComponent
import javax.swing.JPanel


class FacultyPluginConfigurable : Configurable, NoScroll, Disposable {

    override fun getDisplayName(): String = "Faculty Plugin Configuration"

    override fun createComponent(): JComponent? {
        val myServers: ComboBox<String> = ComboBox(
            arrayOf("jolly_meitner [Project 1]", "admiring_jepsen [Project 2]")
        )
        return JPanel(  ).also { it.add(myServers) }
    }

    override fun dispose() {}

    override fun isModified(): Boolean = false

    override fun apply() { }

    override fun reset() { }
}
