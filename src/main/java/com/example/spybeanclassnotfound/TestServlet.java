package com.example.spybeanclassnotfound;

public class TestServlet extends jakarta.servlet.http.HttpServlet {

    private final SomeRepository someRepository;

    public TestServlet(SomeRepository someRepository) {
        this.someRepository = someRepository;
    }

    public void someMethod() {
        System.out.println(someRepository.findAll());
    }
}
