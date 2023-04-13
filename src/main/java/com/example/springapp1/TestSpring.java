package com.example.springapp1;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import com.example.springapp1.config.MyConfiguration;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        Logger root = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
        root.setLevel(Level.INFO);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Music music = context.getBean("rockMusic", Music.class);
//        System.out.println(music.getSong());
//
//        Music music2 = context.getBean("classicalMusic", Music.class);
//        System.out.println(music2.getSong());

//        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        musicPlayer.playMusic();

//        Computer computer = context.getBean(Computer.class);
//        System.out.println(computer);

        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic1 = context.getBean(ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean(ClassicalMusic.class);

        System.out.println(classicalMusic1 == classicalMusic2);

        context.close();

    }
}
