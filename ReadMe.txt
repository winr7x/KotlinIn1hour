### Course link
https://youtu.be/30tchn0TjaM


### Install Kotlin compiler
sudo snap install --classic kotlin

### Compile & Run chapter
CHAPTER=01-HelloWorld && \
if [[ -d $CHAPTER ]]; then \
kotlinc $CHAPTER/* -include-runtime -d out/$CHAPTER.jar; else \
kotlinc $CHAPTER.kt -include-runtime -d out/$CHAPTER.jar; fi && \
java -jar out/$CHAPTER.jar

