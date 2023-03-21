package com.exam.pattern.template;


import org.junit.jupiter.api.Test;

public class TemplatTestV1 {

    @Test
    void 템플릿_테스트(){
        abstractTemplate template1 = new SubClassLogicV1();
        abstractTemplate template2 = new SubClassLogicV2();
        template1.execute();
        template2.execute();
    }
}
