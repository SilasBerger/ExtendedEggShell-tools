import java.util.*

/**
 * Created by Silas on 23.05.2017.
 */



class HundredPapersGroundTruth : AbstractGroundTruth(){

    override fun buildList(){
        list.add(Paper("Ache00aScriptingCoordStyles", "Scripting Coordination Styles", 2000, "Franz Achermann", "Stefan Kneubuehl", "Oscar Nierstrasz"))
        list.add(Paper("Ache01bPASCL", "PICCOLA – a Small Composition Language", 2001, "Franz Achermann", "Markus Lumpe", "Jean-Guy Schneider", "Oscar Nierstrasz"))
        list.add(Paper("Ache05aPiccolaReasoningSCG", "A Calculus for Reasoning about Software Composition", 2005, "Franz Achermann", "Oscar Nierstrasz"))
        list.add(Paper("Arev03cASE03XRayViews", "XRay Views: Understanding the Internals of Classes", 2005, "Gabriela Arévalo", "Stéphane Ducasse", "Oscar Nierstrasz"))
        list.add(Paper("Aria11aDependencyAnalysis", "Can we predict dependencies using domain information?", 2003, "Amir Aryani", "Fabrizio Perin", "Mircea Lungu", "Abdun Naser Mahmood", "Oscar Nierstrasz"))
        list.add(Paper("Bali06aHowDevelopersCopy", "How Developers Copy", 2006, "Mihai Balint", "Tudor Gîrba", "Radu Marinescu"))
        list.add(Paper("Berg04aIAM-04-003", "Classboxes: Controlling Visibility of Class Extensions", 2004, "Alexandre Bergel", "Stéphane Ducasse", "Oscar Nierstrasz", "Roel Wuyts"))
        list.add(Paper("Berg05cAnalyzingModuleDiversity", "Analyzing Module Diversity", 2005, "Alexandre Bergel", "Stéphane Ducasse", "Oscar Nierstrasz"))
        list.add(Paper("Berg05eDynamicClassboxes", "Scoped and Dynamic Aspects with Classboxes", 2005, "Alexandre Bergel", "Stéphane Ducasse"))
        list.add(Paper("Berg08b-DylaWorkshop", "Third Workshop on Dynamic Languages and Applications", 2008, "Alexandre Bergel", "Wolfgang De Meuter", "Stéphane Ducasse", "Oscar Nierstrasz", "Roel Wuyts"))
        list.add(Paper("Bert03bMasterRapport", "Compréhension de systèmes orientés-objet par l’utilisation d’informations dynamiques condensées", 2003, "Roland Bertuli")) //TODO: check
        list.add(Paper("Brun09aPyGirlTechreport", "Generating Whole-System VMs from high-level models using PyPy", 2009, "C. Bruni", "T. Verwaest", "M. Denker")) //TODO: check if we need dots
        list.add(Paper("Cass08a-NileNewKernel-ComputerLanguages", "Traits at Work: the design of a new trait-based stream library", 2008, "Damien Cassou", "Stéphane Ducasse", "Roel Wuyts"))
        list.add(Paper("Chis15c-PracticalDomainSpecificDebuggers", "Practical domain-specific debuggers using the Moldable Debugger framework", 2015, "Andrei Chiș", "Marcus Denker", "Tudor Gîrba", "Oscar Nierstrasz"))
        list.add(Paper("Chis16a-MoldableContextAwareSearchingWithSpotter", "Moldable, Context-Aware Searching with SPOTTER", 2016, "Andrei Chiș", "Tudor Gîrba", "Juraj Kubelka", "Oscar Nierstrasz", "Stefan Reichhart", "Aliaksei Syrel"))
        list.add(Paper("Cruz01LMO", "CORODS: A Coordination Programming System for Open Distributed Systems", 2001, "Juan Carlos Cruz"))
        list.add(Paper("Cruz02Coordination", "OpenCoLaS a Coordination Framework for CoLaS Dialects", 2002, "Juan Carlos Cruz"))
        list.add(Paper("Cruz98bManagingEvolution", "Managing Evolution of Coordination Aspects in Open Systems", 1998, "Juan Carlos Cruz", "Sander Tichelaar"))
        list.add(Paper("Deme00aFindingRefactoring", "Finding Refactorings via Change Metrics", 2000, "Serge Demeyer", "Stéphane Ducasse", "Oscar Nierstrasz"))
        list.add(Paper("Deme97bDesignGuidelines", "Design Guidelines for Tailorable Frameworks", 1997, "Serge Demeyer", "Theo Dirk Meijler", "Oscar Nierstrasz", "Patrick Steyaert"))
        list.add(Paper("Deme99aDemeyerDucasseLMO99", "Metrics, Do They Really Help?", 1999, "Serge Demeyer", "Stéphane Ducasse"))
        list.add(Paper("Denk06aRuntimeByteCodeESUGJournal", "Runtime bytecode transformation for Smalltalk", 2006, "Marcus Denker", "Stéphane Ducasse", "Éric Tanter"))
        list.add(Paper("Denk10a-Models10-FeatureModels", "Modeling Features at Runtime", 2010, "Marcus Denker", "Marcus Denker", "Jorge Ressia", "Orla Greevy", "Oscar Nierstrasz"))
        list.add(Paper("Duca01aTowardsAMethod", "Towards a Methodology for the Understanding of Object-Oriented Systems", 2001, "Stéphane Ducasse", "Michele Lanza"))
        list.add(Paper("Duca04aRuntimePolymetricViewsSCG", "High-Level Polymetric Views of Condensed Run-time Information", 2004, "Stéphane Ducasse", "Michele Lanza", "Roland Bertuli"))
        list.add(Paper("Gael04aOrderingBrokenUnitTestsForFocusedDebugging", "Ordering Broken Unit Tests for Focused Debugging", 2004, "Markus Gälli", "Michele Lanza", "Oscar Nierstrasz", "Roel Wuyts"))
        list.add(Paper("Gael04dCorrelatingUnitTestsAndMethodsUnderTest", "Correlating Unit Tests and Methods under Test", 2004, "Markus Gälli"))
        list.add(Paper("Girb04dEntitiesChangeTogether", "Identifying Entities That Change Together", 2005, "Tudor Gîrba", "Stéphane Ducasse", "Radu Marinescu", "Daniel Rațiu"))
        list.add(Paper("Girb05bMetaModelTransATEM2004", "Using Meta-Model Transformation to Model Software Evolution", 2005, "Tudor Gîrba", "Jean-Marie Favre", "Stéphane Ducasse"))
        list.add(Paper("Girb15b-PervasiveSoftwareVisualizations", "Pervasive Software Visualizations", 2015, "Tudor Gîrba", "Andrei Chiș"))
        list.add(Paper("Gree05aCSMR2005FeaturesIEEEButInBadState", "Correlating Features and Code Using A Compact Two-Sided Trace Analysis Approach", 2005, "Orla Greevy", "Stéphane Ducasse"))
        list.add(Paper("Haen14a-QuantitativeEcosystemInformationNeeds", "A Quantitative Analysis of Developer Information Needs in Software Ecosystems", 2014, "Nicole Haenni", "Mircea Lungu", "Niko Schwarz", "Oscar Nierstrasz"))
        list.add(Paper("Hamo07a-pcoda2007proceedings", "Workshop on Program Comprehension through Dynamic Analysis", 2007, "Abdelwahab Hamou-Lhadj", "Andy Zaidman", "Orla Greevy")) //TODO: check
        list.add(Paper("Hofe06aUnstuckNode", "Design and Implementation of a Backward-In-Time Debugger", 2006, "Christoph Hofer", "Marcus Denker", "Stéphane Ducasse"))
        list.add(Paper("Kuhn05bHapaxPCODA2005", "Applying Semantic Analysis to Feature Execution Traces", 2005, "Adrian Kuhn", "Orla Greevy", "Tudor Gîrba"))
        list.add(Paper("Kuhn09aLogLikelihoodRatio", "Automatic Labeling of Software Components and their Evolution using Log-Likelihood Ratio of Word Frequencies in Source Code", 2009, "Adrian Kuhn"))
        list.add(Paper("Kuhn10c-softvis2010-kuhn-codemap-userstudy", "Embedding Spatial Software Visualization in the IDE: an Exploratory Study", 2010, "Adrian Kuhn", "David Erni", "Oscar Nierstrasz"))
        list.add(Paper("Lanz02bModelIndependentMetrics", "Beyond Language Independent ObjectOriented Metrics: Model Independent Metrics", 2002, "Michele Lanza", "Stéphane Ducasse"))
        list.add(Paper("Lien06aCapturingHowObjectsFlowPCODA06", "Capturing How Objects Flow at Runtime", 2006, "Adrian Lienhard", "Stéphane Ducasse", "Tudor Gîrba", "Oscar Nierstrasz"))
        list.add(Paper("Lien11aDynamicAnalysis", "Specifying Dynamic Analyses by Extending Language Semantics", 2011, "Adrian Lienhard", "Tudor Gîrba", "Oscar Nierstrasz"))
        list.add(Paper("Lung07bSmallProjectObservatory", "A Small Observatory for Super-Repositories", 2007, "Mircea Lungu", "Tudor Girba"))
        list.add(Paper("Lung07cSuperRepositories", "Reverse Engineering Super-Repositories", 2007, "Mircea Lungu", "Michele Lanza", "Tudor Gîrba", "Reinout Heeck"))
        list.add(Paper("Lung09aSPO", "The Small Project Observatory: Visualizing software ecosystems", 2009, "Mircea Lungu", "Michele Lanza", "Tudor Gîrba", "Romain Robbes"))
        list.add(Paper("Lung09b", "Reverse Engineering Software Ecosystems", 2009, "Mircea F. Lungu"))
        list.add(Paper("Lung10a", "Recovering Inter-Project Dependencies in Software Ecosystems", 2010, "Mircea Lungu", "Romain Robbes", "Michele Lanza"))
        list.add(Paper("Lung13a-Planning", "On Planning an Evaluation of the Impact of Identifier Names on the Readability and Maintainability of Programs", 2013, "Mircea Lungu", "Jan Kurš"))
        list.add(Paper("Lung14a", "Evolutionary and Collaborative Software Architecture Recovery with Softwarenaut", 2014, "Mircea Lungu", "Michele Lanza", "Oscar Nierstrasz"))
        list.add(Paper("Mari05aSAIL", "Towards a Simplified Implementation of Object-Oriented Design Metrics", 2005, "Cristina Marinescu", "Radu Marinescu", "Tudor Gîrba"))
        list.add(Paper("Matt09aAssigningBugreports", "Assigning Bug Reports using a Vocabulary-Based Expertise Model of Developers", 2009, "Dominique Matter", "Adrian Kuhn", "Oscar Nierstrasz"))
        list.add(Paper("Meij97bBeyondObjects", "Beyond Objects: Components", 1997, "Theo Dirk Meijler", "Oscar Nierstrasz"))
        list.add(Paper("Mens99a", "Declaratively Codifying Software Architectures using Virtual Software Classifications", 1999, "Kim Mens", "Roel Wuyts"))
        list.add(Paper("Meri15a-DRAFT", "Explora: Tackling Corpus Analysis with a Distributed Architecture", 2015, "Leonel Merino"))
        list.add(Paper("Meye06aMondrian", "Mondrian: An Agile Information Visualization Framework", 2006, "Michael Meyer", "Tudor Gîrba", "Mircea Lungu"))
        list.add(Paper("Nier00cAgentsEverywhere", "Agents Everywhere, All the Time", 2000, "Oscar Nierstrasz", "Jean-Guy Schneider", "Franz Achermann"))
        list.add(Paper("Nier03cPiccolaCalculus", "A Calculus for Modeling Software Components", 2003, "Oscar Nierstrasz", "Franz Achermann"))
        list.add(Paper("Nier08bChangeEnabledSoftware", "Change-Enabled Software Systems", 2008, "Oscar Nierstrasz", "Marcus Denker", "Tudor Gîrba", "Adrian Lienhard", "David Röthlisberger"))
        list.add(Paper("Peri09aEnablingevolutionOfJEAs", "Enabling the evolution of J2EE Applications through reverse engineering and quality assurance", 2009, "Fabrizio Perin"))
        list.add(Paper("Poll07a-CSMRSARTaxonomy", "A Process-Oriented Software Architecture Reconstruction Taxonomy", 2007, "Stéphane Ducasse", "Damien Pollet", "Loïc Poyet"))
        list.add(Paper("Reng09bLanguageShootout", "Why Smalltalk Wins the Host Languages Shootout", 2009, "Lukas Renggli", "Tudor Gîrba"))
        list.add(Paper("Reng10bDomainSpecificProgramChecking", "Domain-Specific Program Checking", 2010, "Lukas Renggli", "Stéphane Ducasse", "Tudor Gîrba", "Oscar Nierstrasz"))
        list.add(Paper("Ress12a-ObjectCentricDebugging", "Object-Centric Debugging", 2012, "Jorge Ressia", "Alexandre Bergel", "Oscar Nierstrasz"))
        list.add(Paper("Roet08eDynamicDependenciesIDE", "Representing and Integrating Dynamic Collaborations in IDEs", 2008, "David Röthlisberger", "Orla Greevy"))
        list.add(Paper("Scha02cTraitsModel", "Traits: The Formal Model", 2002, "Nathanael Schärli", "Oscar Nierstrasz", "Stéphane Ducasse", "Roel Wuyts", "Andrew Black"))
        list.add(Paper("Schn16a", "CuboidMatrix: Exploring Dynamic Structural Connections in Software Components using Space-Time Cube", 2016, "Teseo Schneider", "Yuriy Tymchuk", "Ronie Salgado", "Alexandre Bergel"))
        list.add(Paper("Schu12a-clone-representation", "How to Make the Hidden Visible – Code Clone Presentation Revisited", 2012, "Sandro Schulze", "Niko Schwarz"))
        list.add(Paper("Schw11aSeuss-Springer", "Seuss: Better Class Responsibilities through Language-Based Dependency Injection", 2011, "Niko Schwarz", "Mircea Lungu", "Oscar Nierstrasz"))
        list.add(Paper("Schw11bDoodleDebug", "DoodleDebug, Objects Should Sketch Themselves For Code Understanding", 2011, "Niko Schwarz"))
        list.add(Paper("Seeb06bChronia", "Chronia: Visualizing How Developers Change Software Systems", 2006, "Mauricio Seeberger", "Adrian Kuhn", "Tudor Gîrba", "Stéphane Ducasse"))
        list.add(Paper("Thal06aJamTomorrow", "Jam Tomorrow: Collaborative Music Generation in Croquet Using OpenAL", 2006, "Florian Thalmann", "Markus Gaelli"))
        list.add(Paper("Tich00aDesignGuidelines", "Design Guidelines for Coordination Components", 2000, "Sander Tichelaar", "Juan Carlos Cruz", "Serge Demeyer"))
        list.add(Paper("Tich99mSniffToRationalRose", "SNiFF+ Talks to Rational Rose Interoperability using a Common Exchange Model", 1999, "Sander Tichelaar", "Serge Demeyer"))
        list.add(Paper("Vasa08aResilienceToChange", "Electronic Communications of the EASST Volume 8 (2008)", 2009, "Rajesh Vasa", "Jean-Guy Schneider", "Oscar Nierstrasz", "Clinton Woodward"))
        list.add(Paper("Vasa09aGiniICSM", "Comparative Analysis of Evolving Software Systems Using the Gini Coefficient", 2009, "Rajesh Vasa", "Markus Lumpe", "Philip Branch", "Oscar Nierstrasz"))
        list.add(Paper("Verb08aQTAPC2008", "Query Technologies and Applications for Program Comprehension", 2008, "Mathieu Verbaere", "Michael W. Godfrey", "Tudor Gîrba"))
        list.add(Paper("Verw09aSafeReflectionThroughPolymorphism", "Safe Reflection Through Polymorphism", 2009, "Toon Verwaest", "Lukas Renggli"))
        list.add(Paper("Verw11aRuntimeUpdates", "Runtime Class Updates using Modification Models", 2011, "Toon Verwaest", "Niko Schwarz", "Erwann Wernli"))
        list.add(Paper("Verw11bFlexibleObjectLayouts", "Flexible Object Layouts", 2011, "Toon Verwaest", "Mircea Lungu", "Oscar Nierstrasz", "Camillo Bruni"))
        list.add(Paper("Vran12a", "On the Integration of Smalltalk and Java Practical Experience with STX:LIBJAVA", 2012, "Marcel Hlopko", "Jan Kurš", "Jan Vraný", "Claus Gittinger"))
        list.add(Paper("Weih05aHigherOrderMessagingOOPSLA2005", "Higher Order Messaging", 2005, "Marcel Weiher", "Stéphane Ducasse"))
        list.add(Paper("Wern11aActiveContext", "Using First-class Contexts to realize Dynamic Software Updates", 2011, "Erwann Wernli", "David Gurtner", "Oscar Nierstrasz"))
        list.add(Paper("Wern12a", "Incremental Dynamic Updates with First-class Contexts", 2012, "Erwann Wernli", "Mircea Lungu", "Oscar Nierstrasz"))
        list.add(Paper("Wern12b", "Theseus: Whole Updates of Java Server Applications", 2012, "Erwann Wernli"))
        list.add(Paper("Wern12c", "Ownership, Filters and Crossing Handlers Flexible Ownership in Dynamic Languages", 2012, "Erwann Wernli", "Pascal Maerki", "Oscar Nierstrasz"))
        list.add(Paper("Wern14a", "Delegation Proxies: The Power of Propagation", 2014, "Erwann Wernli", "Oscar Nierstrasz", "Camille Teruel", "Stéphane Ducasse"))
        list.add(Paper("Wint02aPecosApproach", "Components for Embedded Software — The PECOS Approach", 2002, "MichaelWinter", "Thomas Genßler", "Alexander Christoph", "Oscar Nierstrasz", "Stéphane Ducasse", "Roel Wuyts", "Gabriela Arévalo", "Peter Müller", "Chris Stich", "Bastiaan Schönhage"))
        list.add(Paper("Wuyt01a", "Symbiotic Reflection between an Object-Oriented and a Logic Programming Language", 2001, "Roel Wuyts", "Stéphane Ducasse"))
        list.add(Paper("Wuyt01c", "Composition Languages for BlackBox Components", 2001, "Roel Wuyts", "Stéphane Ducasse"))
        list.add(Paper("Wuyt01d", "Applying Experiences with Declarative Codifications of Software Architectures on COD", 2001, "Roel Wuyts", "Stéphane Ducasse", "Gabriela Arévalo"))
        list.add(Paper("Wuyt01e", "NonFunctional Requirements in a Component Model for Embedded Systems", 2001, "Roel Wuyts", "Stéphane Ducasse"))
        list.add(Paper("Wuyt01f", "Synchronising Changes to Design and Implementation using a Declarative Meta-Programming Language", 2001, "Roel Wuyts"))
        list.add(Paper("Wuyt01g", "Language Symbiosis through Symbiotic Reflection", 2001, "Roel Wuyts", "Stéphane Ducasse"))
        list.add(Paper("Wuyt01h", "Codifying Structural Regularities of Object-Oriented Programs", 2001, "Roel Wuyts", "Kim Mens"))
        list.add(Paper("Wuyt03bClassifications", "Unanticipated Integration of Development Tools using the Classification Model", 2003, "Roel Wuyts", "Stéphane Ducasse"))
        list.add(Paper("Wuyt04aClassificationsSCG", "Unanticipated Integration of Development Tools using the Classification Model", 2004, "Roel Wuyts", "Stéphane Ducasse"))
        list.add(Paper("Wuyt04x-OOR04Report", "Report of the Fifth International Workshop on Object-Oriented Reengineering", 2004, "Roel Wuyts", "Stéphane Ducasse", "Serge Demeyer", "Kim Mens"))
        list.add(Paper("Wuyt05aPecosElsevier", "A data-centric approach to composing embedded, real-time software components", 2005, "Roel Wuyts", "Stéphane Ducasse", "Oscar Nierstrasz"))
        list.add(Paper("Wuyt96a", "Class-management using Logical Queries, Application of a Reflective User Interface Builder", 1996, "Roel Wuyts"))
        list.add(Paper("Wuyt99a", "Explicit Support for Software Development Styles throughout the Complete Life Cycle", 1999, "Roel Wuyts", "Kim Mens", "Theo D'Hondt"))
        list.add(Paper("Zaid06a-pcoda2006proceedings", "Program Comprehension through Dynamic Analysis", 2006, "Andy Zaidman", "Abdelwahab Hamou-Lhadj", "Orla Greevy"))
        list.add(Paper("Zaid08a-pcoda2008proceedings", "Workshop on Program Comprehension through Dynamic Analysis (PCODA’08)", 2008, "Andy Zaidman", "Abdelwahab Hamou-Lhadj"))
    }

    override fun printCSV(){
        println("undefined,filename,type,title,contributor1,contributor2,contributor3,contributor4,contributor5,contributor6,contributor7,contributor8,contributor9,contributor10,year")
        for (paper in list){
            println(paper)
        }
    }

}

