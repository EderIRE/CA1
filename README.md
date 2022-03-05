# CA1 - Design an "About me" Android app.

## 23761 - Eder Souza da Costa

## Requirements CheckList

✅ Main Activity (or Launcher Activity)  
✅ Button Links open new Activity  
⚠️ Home icon opens Main Activity from back-stack instead of creating newly  
✅ Exit Button finishes the activity and closes the app ( Exit button on Main Screen might need double click to close the app)  
⚠️ Text is not hardcoded in the layout but is present in "strings" resources xml file  
### Image Assets  
✅ Images (Raster) are used
✅ Vector icons (inbuilt material icons) are used
✅ SVG icon is used
### Layout and Design:
✅ All text presented should be clear and legible and should have sufficient contrast (Hint: Dark Gray Text on Dark Blue background is bad)
✅ All activities should contain ScrollViews to display lengthy content
**In Main Activity,** 
⚠️ Basic details are centered horizontally
✅ Photo has at least 5dp margin on all sides
✅ 4 buttons have same length
### Copyright Text 
✅ has a small font size
✅ has dark gray color
✅ has a top padding 10dp with a top gray border of 1dp (to separate it out from the main content)
**In all 4 extra activities,** 
✅ title row is at the top of the app and does not scroll
✅ title row has a dark background (and hence white/light colored text and icon)
✅ button row is at the bottom of the app and does not scroll
✅ button row has 3 buttons (or 2 buttons) are present in one row with at least 5dp space in between them
⚠️ button row spans full width of the app (i.e. each button's width will be set based on app's width)
⚠️ icon and title are displayed on top and in one row horizontally centered. Contents inside this row should be vertically aligned in the centre (while the row itself is at the top of the page)
### Coding Practices (Hint: Check online if you don't know what the right/best practice is):
✅ Variable and File Naming conventions are followed
✅ Code is properly indented
✅ Right File Structure is followed (e.g. Layout xml files placed directly under resources directory is bad, place it in "layout" folder instead)
### Hard:
✅ Use at least one FrameLayout as a separator e.g. to separate two LinearLayouts or TextViews (Hint: Set height 1dp with a light gray background)
✅ Show both icons and text in buttons (except home icon)
✅ Make ImageView display your photo with rounded corners (without editing your photo)

## Report

To design an About Me application, I have started designing the top bar, bottom bar and some icons using the Material Design language developed by Google.
To successfully complete most of the tasks, I have used some important pieces of advice from StackOverFlow, which I could apply an alternative way to make the ImageView display photos with rounded corners using the CardView implementation, exit the application using exitProcess and finish the activity using finish(). 
I have encountered difficulties to use Android Studio, which is so buggy and heavy on my laptop i5 8Gb Ram. Several times the Android Emulator got stuck at "Waiting for the target to come online", which was solved by accessing the AVD Manager and Wipe Data.
I failed to develop an exit button that closes the application immediately instead the user will need to touch twice the exit icon to close the application. I couldn't find a better method to do it. I also couldn't complete some layouts requirements.
Most of those challenges that I have encountered was successfully solved enhancing my self taught learning and solving-problem skills. Developing for the first time a Kotlin application was a pleasant experience that I want to master to create more advanced applications in the future and work as Android Developer.
In this project, I also improved the better method to present a project on GitHub such as Releases options to show each release of your application and describe it and use MarkDown to write a ReadMe file which it's a good practice to help the people understand what your project is about. 
In the next Kotlin project, I aim to improve the best coding practices and better methods to develop Kotlin applications, get used to Android Studio and improve the design of the layouts which I started to have a better understanding of it after using the Material Design language. 
