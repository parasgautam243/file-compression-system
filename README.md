# File Compression - [Huffman Encoding]

## Overview

I developed a Java application that implements Huffman encoding for lossless file compression. This tool shrink any file’s size without data loss and then restore it to its original form. Additionally, it supports converting a plain alphabetic string into a minimized binary sequence, making it ideal for efficient transmission or storage.

## Features

- **Huffman Encoding**: I implemented a Huffman Tree and the necessary encoding/decoding algorithms for efficient compression.
- **Custom Data Structures**: I created several data structures—such as a singly linked list, priority queue, and more—tailored for the compression tasks.

## Code and Files

Inside the [`src` folder](src), you’ll find all of my classes and forms:

### 1. Data Structures
- **Node.java**  
  A generic node class reused by multiple data structures throughout the project.

- **SinglyLinkedList.java**  
  A simple, from-scratch singly linked list used to build other collections.

- **QueueSLL.java**  
  A FIFO queue implementation backed by the singly linked list.

- **CharLinkedList.java**  
  A custom singly linked list specialized for storing characters during encoding.

- **MinPriorityQueue.java**  
  A min-priority queue implementation, essential for selecting the lowest-frequency nodes when constructing the Huffman tree.

### 2. Huffman Algorithm Core
- **ByteFrequency.java**  
  Represents a byte’s frequency count (used to build and weight Huffman nodes).

- **CharNodeFrequency.java**  
  A node containing a character and its frequency—used when generating Huffman codes.

- **HuffmanTree.java**  
  Constructs and manages the Huffman tree structure for both encoding and decoding.

- **MainEncoder.java**  
  Generates Huffman codes from character frequencies and applies them to files.

- **MainCompression.java**  
  Core logic that orchestrates compressing and decompressing files using Huffman encoding.

### 3. Utility & Support
- **Message.java**  
  Handles status messages, input validation, and basic string/byte analysis needed by the compression system.


## Getting Started

### Installation

1. Clone my repository to your local machine:
   ```bash
   git clone https://github.com/parasgautam243/file-compression-system.git

2. Navigate to the project directory:
   ```bash
   cd file-compression-system/src

3. Open the project in your preferred Java IDE.

### Usage

1. Compile the project: Ensure all .java files are compiled. Most IDEs handle this automatically.

2. Use MainCompression.java to take input from the command line.
