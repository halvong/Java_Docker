6/10/18, Sunday

#path
cd /home/hal/Documents/softwares/java_eclipse/java_workspace/DeitelJava/src

#Docker
#builds image
docker build -t deitel_java .

#run a temporary named container from a given image
docker run -it --rm --name java_running deitel_java 