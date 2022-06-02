package es.haniel.shutdown.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping
public class ShutdownController {

    @GetMapping("/shutdown")
    public void shutDown(@RequestParam(defaultValue = "30") String time) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process proc = runtime.exec("shutdown -s -f -t " + time);
    }

    @GetMapping("/restart")
    public void restart(@RequestParam(defaultValue = "30") String time) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process proc = runtime.exec("shutdown -r -f -t " + time);
    }

}
