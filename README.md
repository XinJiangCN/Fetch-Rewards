# Pyramid Coding Challenge
This is the coding challenge of Fetch Rewards.

Author: Xin Jiang

Email: xin@jiangx.in

Link to [My Resume](https://github.com/XinJiangCN/jasonjiangcn.github.io/blob/jason/xin_jiang_resume__tex.pdf)

## Description
Write a web service that takes in a string and returns a boolean to indicate whether or not a word is a pyramid word. A word is pyramid word if you can arrange the letters in increasing frequency, starting with 1 and counting without gaps and without duplicates.

## Implementation
This project is using Kotlin and Spring Boot. It has a Application class and one controller called `isPyramid`, which is a GET method.

This is a maven project and runs on port 10010. 

This project assumes you input a valid, not null string with only letters. i.e., a valid "word".

## Analysis
The controller will first compute the frequency for each word using HashMap. This takes `O(N)` of time.

Then the sorting will take constant time since there is a maximum of 26 keys in the HashMap. 

Then it iterates through the sorted map to determine whether it is a pyramid word. This also takes constant time. 

So the overall time complexity is `O(N)`.

## Usage and Testing

Clone the repository:
`git clone https://github.com/XinJiangCN/Fetch-Rewards-Challange`

Install the dependencies:
`mvn clean install`
**Maven should be installed**


Start the App:
`mvn spring-boot:run`
**Note: port 10010 must be available**

Open a web browser and test:
`http://localhost:10010/isPyramid?str=TARGET`,

where TARGET is the string you may want to test.



The web page will simply display whether the given string is a pyramid word.

`mvn spring-boot:run`

