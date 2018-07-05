function spinWords(str){
    var arrayOfWords = str.split(' ');

    var reversedString = '';
    for (let i = 0; i < arrayOfWords.length; i++) {
        if (arrayOfWords[i].length > 4)
            reversedString += arrayOfWords[i].split('').reverse().join('');
        else
            reversedString += arrayOfWords[i];
        if (i != arrayOfWords.length - 1)
            reversedString += ' ';
    }
    return reversedString;
}