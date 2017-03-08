# ExtendedEggShell importing tools setup

## 1. Prerequisites
Make sure you have Ruby, Perl and Java installed.

## 2. Install Perl libraries (run these in terminal)
### 2.1 Install the cpanm utility
$ cpan App::cpanminus

### 2.2 Install all required modules
$ sudo cpanm Class::Struct</br>
$ sudo cpanm Getopt::Long</br>
$ sudo cpanm Getopt::Std</br>
$ sudo cpanm File::Basename</br>
$ sudo cpanm File::Spec</br>
$ sudo cpanm FindBin</br>
$ sudo cpanm HTML::Entities</br>
$ sudo cpanm IO::File</br>
$ sudo cpanm POSIX</br>
$ sudo cpanm XML::Parser</br>
$ sudo cpanm XML::Twig</br>
$ sudo cpanm XML::Writer</br>
$ sudo cpanm XML::Writer::String</br>

## 3. Install CRF++
Navigate to the previously downloaded tools folder, then further to /mac/parsecit/crfpp. Note that using Homebrew, it should be possible to install CRF++ by issuing this command: "$ brew install crf++".</br>
$ rm -Rf CRF++-0.51</br>
$ tar -xvzf crf++-0.51.tar.gz</br>
$ cd CRF++-0.51</br>
$ ./configure</br>
$ make</br>
$ cp crf_learn crf_test ..</br>
$ cd .libs</br>
$ cp -Rf * ../../.libs</br>


## 4. Last steps
1. Edit the shebang lines (first line) of the scripts in the bin/ directory to point to the correct versions of Perl
1. Test your installation with "$ ./citeExtract.pl -m extract_all ../demodata/sample2.txt"


## Note
Should you encounter problems during the installation, please refer to ParseCit's own install guide, located in the previously downloaded tools folder, at /mac/parsecit/INSTALL.txt.
