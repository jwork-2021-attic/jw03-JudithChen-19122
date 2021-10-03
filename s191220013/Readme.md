## W03

##### example中的代码主要工作原理：

通过阅读example中的代码，我们首先可以看到在main函数中，原先对于BubbleSorter的加载，由原来的自动加载，变成了自定义加载，通过图片来load对应的class，主要通过`SteganographyClassLoader`这个自定义类加载器来实现。我们删除了BubbleSorter对应的java文件后，Bootstrap ClassLoader 和Extension ClassLoader无法完成对该BubbleSorter的加载，于是调用我们自定义的ClassLoader去加载，也就是通过`SteganographyClassLoader`加载。在`SteganographyClassLoader`中，我们不难发现它重写了加载器的`findClass`函数，通过对图片的读取和通过`SteganographyEncoder`分析处理，得到对应的类，并返回该类，从而实现从图片中加载类。而`SteganographyFactory`类则是提供与`SteganographyEncoder`对应的功能，将编码写入图片，得到隐写术图。

##### 隐写术图：

s191220013.QuickSorter:

s191220013.SelectSorter:

为了便于验证给出以下图片：

example.QuickSorter:

example.SelectSorter:

##### 动画的链接：由于在线图片可能出现问题，此处使用的是本地路径

s191220013.QuickSorter:[project3-quicksorter - asciinema](https://asciinema.org/a/mW6AVJAwdmNKemGUGIkNXMqz9)

s191220013.SelectSorter:[project3-selectsorter - asciinema](https://asciinema.org/a/rvPA9zY5XIAN5GLTcyGDnDcXF)

##### 尝试验证

使用了**202220008 刘睿哲**同学的图片`example.ShellSorter.png`，得到结果正确。