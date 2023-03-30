package com.example.spybeanclassnotfound;

public class TestServlet extends jakarta.servlet.http.HttpServlet {

    private final SpybeanClassnotfoundRepository spybeanClassnotfoundRepository;

    public TestServlet(SpybeanClassnotfoundRepository spybeanClassnotfoundRepository) {
        this.spybeanClassnotfoundRepository = spybeanClassnotfoundRepository;
    }

    public void someMethod() {
        System.out.println(spybeanClassnotfoundRepository.findAll());
    }
}
