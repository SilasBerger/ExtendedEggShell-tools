# How to install and use ExtendedEggShell

This document was last updated on February 20, 2017.

## Installation
### Download the core resources
1. Download Moose 6.0 from the [Moose Technology download page](http://www.moosetechnology.org/#install). **Note: The path to your Moose image cannot contain any whitespaces, in order for the PDF importing functions to work.**
1. In Moose, execute the following code in a playground, in order to load the project:
```smalltalk
Gofer new
    package: 'ConfigurationOfExtendedEggShell';
    url: 'http://smalltalkhub.com/mc/SilasBerger/ExtendedEggShell/main'
    username: '' password: '';
    update.
(ConfigurationOfExtendedEggShell project version: '0.1') load
```

### Download the optional resources
The following resources are only needed to parse and analyze PDFs. If you already have an XML file containing a ScientificCommunity model exported from ExtendedEggShell and you only want to work with this, you don't need to complete these next steps. Note that the importing tools are currently only available for OS X.

1. Download the contents of [this GitHub repository](https://github.com/SilasBerger/ExtendedEggShell-tools), put the "tools" folder next to the Moose image you want to use for ExtendedEggShell
1. Follow the instructions in [INSTALL.md](INSTALL.md) to install ParseCit
 
## Basic usage
### Modelling PDFs
To download a set of example papers, execute the following line:

```smalltalk
FileDownloader downloadExamplePDFs
```

This will create a folder called "examplePDFs" in your working directory, which will contain the sample papers.To import the sample PDFs, execute the following commands:
```smalltalk
scientificCommunity := ModelLoader new modelExamplePDFs
```
Note that this process will take a while, even for a rather small number of PDFs. There's no progress update feedback so far, so just be patient.

If you want to use a custom set of PDFs, you can model them as follows:
```smalltalk
folder := (Path from: '/users/chandlerbing/myPapers') asFileReference. "specify the FileReference to the folder containing the PDFs"
scientificCommunity := ModelLoader new modelPDFs: folder
```

### Visualizing a ScientificCommunity model
```smalltalk
graph := SCGraph new on: sc "sc stores a ScientificCommunity"
```

### Run a search
The following code will open a search field in the world, which can search for authors. Alternatively, you can set the parameter of setIndexSelector: to #searchForPaper.

```smalltalk
se := SCSearchEngine new on: sc. "create a new SearchEngine, sc stores a ScientificCommunity"
se observe: SearchResultsInspector new. "add a new SearchResultsInspector as a search engine observer"

"create a search filed morph, which reports to the new SearchEngine object"
search := SearchMorph new
    model: se;
    setIndexSelector: #searchForAuthor:.

search openInWorld. "open the new search field in World"
```
