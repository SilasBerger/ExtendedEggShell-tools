# How to install and use ExtendedEggShell

This document was last updated on February 19, 2017.

## Installation
### Download the core resources
1. Download Moose 6.0 from the [Moose Technology download page](http://www.moosetechnology.org/#install)
1. In Moose, clone this repo: http://smalltalkhub.com/mc/SilasBerger/ExtendedEggShell/main

### Download the optional resources
The following resources are only needed to parse and analyze PDFs. If you already have an XML file containing a ScientificCommunity model exported from ExtendedEggShell and you only want to work with this, you don't need to complete these next steps. Note that the importing tools are currently only available for OS X.

1. Download the contents of [this GitHub repository](https://github.com/SilasBerger/ExtendedEggShell-tools), put the "tools" folder next to the Moose image you want to use for ExtendedEggShell
1. Follow the instructions in [INSTALL.md]() in downloaded repository, to install ParseCit
 
## Basic usage
### Modelling PDFs
Currently, the ModelLoader expects the PDFs to be located in the working directory of the Moose image, in a subfolder naed "examplePDFs". You can download a set of example PDFs directly into that folder by executing

```smalltalk
FileDownloader downloadExamplePDFs
```

To import the PDFs, execute the following commands:</br>
```smalltalk
loader := ModelLoader new.
scientificCommunity := loader modelExamplePDFs.
```
Note that this process will take a while, even for a rather small number of PDFs. There's no progress update feedback so far, so just be patient.

### Exporting a ScientificCommunity model
```smalltalk
exportPath := Path from: '/users/chandlerbing/mySCExport.xml'. "specify the export file path"
ModelXMLExporter export: sc as: expPath. "export the ScientificCommunity stored in sc to the specified path"
```
### Loading a model from XML
Note: currently, there is a bug in this feature. Users are advised to load models directly from a set of PDFs for now.

```smalltalk
path := Path from: '/users/chandlerbing/mySCExport.xml'. "specify the path of your ScientificCommunity XML export file"
file := FileSystem resolvePath: path. "load the file from the specified path".
scientificCommunity := XMLModelLoader new loadFromXML: path. "load the model from the loaded file"
```

### Visualizing a ScientificCommunity model
```smalltalk
graph := SCGraph new on: sc. "sc stores a ScientificCommunity"
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
