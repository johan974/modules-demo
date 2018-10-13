module hello.module {
    exports com.hello.modules.hello;
    provides com.hello.modules.hello.HelloInterface with com.hello.modules.hello.HelloModules;
}