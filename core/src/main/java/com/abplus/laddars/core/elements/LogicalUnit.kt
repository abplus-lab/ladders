package com.abplus.laddars.core.elements

@Suppress("unused")
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class LogicalUnit(
    val name: String,
    val priority: Priority = Priority.Normal
) {
    enum class Priority {
        High,
        Normal,
        Low
    }
}
