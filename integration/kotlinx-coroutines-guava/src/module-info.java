module kotlinx.coroutines.guava {
    requires kotlin.stdlib;
    requires kotlinx.coroutines.core;
    requires com.google.common;
    requires failureaccess;

    exports kotlinx.coroutines.guava;
}
