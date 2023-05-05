# Music Visualiser Project


**Name:** Zoe Fabre-Anderson, Shahida Mohammed-Ahmed, Joanne Umeh, Naomi Togbe


**Student Number:** D22125460, C21333116, D22126855, C21495372


# Description of the assignment
Our assignment is the creation of an audio visualiser using Digital Audio Processing in Java. We mapped lines and shapes to the sound waves and frequency of the song Boy's A Liar Pt.2 by PinkPantheress ft. Ice Spice. We used a variety of visuals in order to capture the mood and energy of the song. The core theme of our visuals is the use of a pink and orange, aswell as hearts. The hearts are used to represent the lyrics of the song, which is about loving someone who you know is not dedicated to you. The colours pink and orange symbolise PinkPantheress and Ice Spce, respectfully.

We had a major roadblock to completing the assignment. Shahida had originally been the main repo that we all pushed to, but on Tuesday night it got corrupted. I (Zoe) then deleted the broken repo to refork the MusicVisuals repo again, so that we could try finish the project. This led to a major time crunch in the last couple days before the demo.
Shahida's repo: https://github.com/c21333116/MusicVisuals
Joanne's repo: https://github.com/Joanneumeh/MusicVisuals
Naomi's repo: https://github.com/naomitogbe

## Instructions
To play out visualiser: Press debug/run, then using the hot keys 1 - 6 you cans switch between different visuals. 
One of our visuals is interactive. 
Starting the visualiser displays our heart-shaped Ships and requires you to use the arrow keys and spacebar, to move and shoot out heart-shaped bullets.
Pressing key 2 shows the 3D cupe and 2D heart
Pressing key 3 shows a beating heart on top of a monochrome background
Pressing key 4 shows our twerking stickperson
Pressing key 5 shows the noise terrain


## What We are most proud of in the assignment
We are proud of the YASC.java Heart-shaped ships. It took a long time to instantiate everything, as it was linked to two other files. It was also diffcult placing the ships in such a way that they would make the outline of a heart. We are also proud for the fact it was a visual which best represented the song (lost love). We really enjoyed running, testing and playing with it in order to improve it and fully understand how it works.


# Table of Work
| Student Name | Visual Description | How it works |
|-----------|-----------|-----------|
| Joanne Umeh | Keybind 1: YASC Heart-shaped ships and bullets | The Yasc java file is a file that a number of red hearts displayed on the screen. These hearts can move clockwise and anti-clockwise. When the space bar is entered the hearts begin to produce mini hearts that can be compared to bullets |
| Joanne Umeh | Seperate terminal window: Confetti EndScreen | The Confetti java file uses a JFrame to produce mini rectangles that fall vertically on the screen. I used a random colour generator to make it look like confetti. I also added sliding text to the file in order for it to resemble a credit page. |
| Zoe Fabre-Anderson | Keybind 2: A 3D cube which spins. Inside is a smaller 2D heart, and text which says the title of the song. | The cube calculates the average amplitude, lerps it and then maps it to the cube size. The heart and Text were static and did not read in any audio. This entire visual (cube, heart and text) rotated at an angle. Overall it was fairly simple to make. |
| Shahida Mohammed-Ahmed | Keybind 3: Beating heart with monochrome bars | Rectangles and lines created a monochrome background. A heart shape in the centre reads in the amplitude of the song and maps it the size. The heart pulses as the song plays. We didn't intend to have the black bars go throught the heart, but over the course of the project, it grew on us. |
| Shahida Mohammed-Ahmed | Keybind 4: Twerking person (Ice Spice) | Circles, ellipses and rectangles were used to create a stick-figure person. The two ellipses pulsating represent two asscheeks. It is to look like the stick figure is twerking. In future I would try to make it look more like a person, and have the shapes take up more of the negative space on the screen. |
| Naomi Togbe | Keybind 5: Terrain | My “terrain” visual generates an infinite 3d terrain with the use of perlins noise and a 2d array.  In the draw method, I have used the noise function to generate random height values (stored in the array) resulting in a more natural and consistent look to the terrain. beginShape and endShape functions then draw the terrain through a series of connected triangles. |
| Naomi Togbe | Would have linked to Keybind 6: A spinning planet with a ring | my “planet” visual generates a sphere with a ring around it. The planet rotates and the sphere pulsates according to the amplitude of the song which is smoothed by lerp. The ring is drawn using a torus method which i used as a torus is a geometrical shape that already looks like a ring and it has the ability to modify specific details eg radius and inner radius. However moving forward i’d try making a ring another way as it was a bit challenging. |


# Visuals
### **Joanne's Visuals:**
![visual1](https://user-images.githubusercontent.com/123522743/236204085-2a4d5482-c31d-4d0a-8669-4c157f02e08f.png)
![endvisual](https://user-images.githubusercontent.com/123522743/236352899-014b55d0-6761-4def-8d65-3eb08bb54530.png)


### **Zoe Visual:**
![visual2](https://user-images.githubusercontent.com/123522743/236352923-1c00da69-1360-4660-92f7-8a28228cfaca.png)


### **Shahida Visuals:**
![visual4](https://user-images.githubusercontent.com/123522743/236352671-c68cf352-cdac-4e60-8d8b-7bcea882d5cd.png)
![visual3](https://user-images.githubusercontent.com/123522743/236352687-98935d04-ab65-4eba-ad23-a1fad030bd58.png)


### **Naomi Visuals:**
![visual5](https://user-images.githubusercontent.com/123522743/236352943-3fbc7fc7-ffa0-4724-b99b-15c971a0c1a1.png)

How the Terrain and Planet should have looked:
![terrain](https://user-images.githubusercontent.com/123522743/236352981-1f4f4c0b-8f6b-4c57-8d2c-23743bd96cfe.PNG)
![planet](https://user-images.githubusercontent.com/123522743/236352997-e50512c5-c4bc-4be3-ab80-4ddbe09cd410.PNG)

