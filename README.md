# Music Visualiser Project


Name: Zoe Fabre-Anderson, Shahida Mohammed-Ahmed, Joanne Umeh, Naomi Togbe


Student Number: D22125460, C21333116, D22126855, C21495372

## Instructions
- Fork this repository and use it a starter project for your assignment (DONE)
- Create a new package named your student number and put all your code in this package. (DONE)
- You should start by creating a subclass of ie.tudublin.Visual (done)
- There is an example visualiser called MyVisual in the example package
- Check out the WaveForm and AudioBandsVisual for examples of how to call the Processing functions from other classes that are not subclasses of PApplet

# Description of the assignment
Our assignment is the creation of an audio visualiser using Digital Audio Processing in Java. We mapped lines and shapes to the sound waves and frequency of the song Boy's A Liar Pt.2 by PinkPantheress ft. Ice Spice. We used a variety of visuals in order to capture the mood and energy of the song. The core theme of our visuals is the use of a pink and orange, aswell as hearts. The hearts are used to represent the lyrics of the song, which is about loving someone who you know is not dedicated to you. The colours pink and orange symbolise PinkPantheress and Ice Spce, respectfully.

# Instructions
To play out visualiser: Press debug/run, then using the hot keys 1 - 6 you cans switch between different visuals. 
One of our visuals is interactive. 
Pressing key 1 displays out heart-shaped Ships and requires you to use the arrow keys and spacebar, to move and shoot out heart-shaped bullets.

# How it works
blah

# What I am most proud of in the assignment
blahblah


# Table of Work
| Student Name | Visual/Code description | How it works |
|-----------|-----------|-----------|
|Zoe Fabre-Anderson | Keybind 2: A 3D cube which spins. Inside is a smaller heart, and text which says the title of the song. | It calculates the average amplitude, lerps it and then maps it to the cube. The cube pulses to the amplitude of the song
|Joanne Umeh | Some more stuff in this column | Text |
|Shahida Mohammed-Ahmed | Some more stuff in this column | Text |
|Naomi Togbe | Some more stuff in this column | Text |


# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![visual1](https://user-images.githubusercontent.com/123522743/236204085-2a4d5482-c31d-4d0a-8669-4c157f02e08f.png)


This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table of who did what visual/code:

