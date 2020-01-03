package com.sun.processor;

/**
 * 包含了多处不规范命名的代码示例
 * <p>
 * javac -encoding UTF-8 -processor com.sun.processor.NameCheckProcessor com/sun/processor/BADLY_NAMED_CODE.java
 *
 * @author : cuixiuyin
 * @date : 2019/12/27
 */
public class BADLY_NAMED_CODE {

    enum colors {
        red, blue, green;
    }

    static final int _FORTY_TWO = 42;

    public static int NOT_A_CONSTANT = _FORTY_TWO;

    protected void BADLY_NAMED_CODE() {
        return;
    }

    public void NOTcamelCASEmethodNAME() {
        return;
    }
}
