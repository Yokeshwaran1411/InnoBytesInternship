package com.yokesh.demo.runClass;

import java.net.Inet4Address;
import java.time.LocalDateTime;

public record Run(Integer id, String title, LocalDateTime start, LocalDateTime end, Integer miles) {

}
