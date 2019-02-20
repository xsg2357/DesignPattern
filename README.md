# 设计模式(DesignPatter)包名介绍


## abstract_factory_pattern  抽象工厂模式
## archetypal_pattern 原型模式
## factory_pattern 工厂模式
## singleton_pattern 单例模式
## adapter_pattern 适配器模式
  ### 1.为媒体播放器和更高级的媒体播放器创建接口。
      eg：MediaPlayer  AdvancedMediaPlayer
  ### 2.创建实现了 AdvancedMediaPlayer 接口的实体类。
      eg：VlcPlayer Mp4Player
  ### 3.创建实现了 MediaPlayer 接口的适配器类。
      eg:MediaAdapter
  ### 4.创建实现了 MediaPlayer 接口的实体类。
      eg:MediaAdapter
  ### 5.使用 AudioPlayer 来播放不同类型的音频格式。
      AudioPlayer audioPlayer = new AudioPlayer();
        
             audioPlayer.play("mp3", "beyond the horizon.mp3");
             audioPlayer.play("mp4", "alone.mp4");
             audioPlayer.play("vlc", "far far away.vlc");
             audioPlayer.play("avi", "mind me.avi");
## 桥接模式 bridge_pattern
  ### 1.创建桥接实现接口。
      eg：DrawAPI 
  ### 2.创建实现了 DrawAPI 接口的实体桥接实现类。
      eg：RedCircle  GreenCircle 
  ### 3.使用 DrawAPI 接口创建抽象类 Shape。
      eg：Shape  
  ### 4.创建实现了 Shape 接口的实体类。
      eg：Circle   
  ### 5.使用 Shape 和 DrawAPI 类画出不同颜色的圆。
       Shape redCircle = new Circle(100,100, 10, new RedCircle());
       Shape greenCircle = new Circle(100,100, 10, new GreenCircle());
       
            redCircle.draw();
            greenCircle.draw(); 
       执行程序，输出结果：
       
       Drawing Circle[ color: red, radius: 10, x: 100, 100]
       Drawing Circle[  color: green, radius: 10, x: 100, 100]
