package com.example.malldemo.common.api;

public enum ResultCode implements IErrorCode{
    SUCCESS(200, "操作成功"),
    FAILED(500,"操作失败"),
    VALIDATE_FAILED(404,"参数检验失败"),
    UNAUTHORIZED(401,"暂未登录或token已经过期"),
    FORBIDDEN(403,"没有相关权限");
    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
/**
 *枚举类型 ResultCode，它实现了 IErrorCode 接口，该接口包含两个方法： getCode() 和 getMessage()。
 *
 * 该枚举类型有五个枚举常量，分别是 SUCCESS、FAILED、VALIDATE_FAILED、UNAUTHORIZED 和 FORBIDDEN。每个枚举常量都有一个 code 属性和一个 message 属性，分别表示返回码和返回信息。它们都是私有的，只能在枚举类型内部访问。
 *
 * 此外，该枚举类型还有一个私有构造函数，它接收两个参数 code 和 message，用于初始化枚举常量的属性。对于每个枚举常量，都会调用这个构造函数来进行初始化。
 *
 * 由于 ResultCode 实现了 IErrorCode 接口，因此每个枚举常量都需要实现 getCode() 和 getMessage() 方法。这些方法只是简单地返回枚举常量的 code 和 message 属性。
 *
 * 通过这个枚举类型，可以在代码中方便地定义和使用一组标准的返回码和返回信息。例如，可以在控制器方法中使用 ResultCode.SUCCESS 来表示成功返回，并返回该枚举常量的 code 和 message 属性作为响应。
 */