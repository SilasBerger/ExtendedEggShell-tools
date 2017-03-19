#! /bin/bash
regex=".*\.pdf";
folder=$1;
files=($folder/*);

for f in "${files[@]}"; do
    if [[ $f =~ $regex ]]; then
        textfile=$f".txt";
        xmlfile=$f".xml";
        java -jar pdfbox-app-2.0.3.jar ExtractText $f $textfile
        mac/parsecit/bin/citeExtract.pl -m extract_all $textfile $xmlfile
        rm $textfile
    fi
done
