import java.util.*

/**
 * Created by Silas on 23.05.2017.
 */



class GroundTruthBuilder{

    val list: ArrayList<Paper>

    init {
        list = ArrayList()
        buildList()
    }

    private fun buildList(){
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
        list.add(Paper("Chis15c-PracticalDomainSpecificDebuggers", "Practical domain-specific debuggers using the Moldable Debugger framework", 2015, "Andrei Chiç", "Marcus Denker", "Tudor Gîrba", "Oscar Nierstrasz"))//TODO: fix andrei
        list.add(Paper("Chis16a-MoldableContextAwareSearchingWithSpotter", "Moldable, Context-Aware Searching with SPOTTER", 2016, "Andrei Chis", "Tudor Gîrba", "Juraj Kubelka", "Oscar Nierstrasz", "Stefan Reichhart", "Aliaksei Syrel")) //TODO: fix andrei
        list.add(Paper("Cruz01LMO", "CORODS: A Coordination Programming System for Open Distributed Systems", 2001, "Juan Carlos Cruz"))
        list.add(Paper("Cruz02Coordination", "OpenCoLaS a Coordination Framework for CoLaS Dialects", 2002, "Juan Carlos Cruz"))
        list.add(Paper("Cruz98bManagingEvolution", "Managing Evolution of Coordination Aspects in Open Systems", 1998, "Juan Carlos Cruz", "Sander Tichelaar"))
        list.add(Paper("Deme00aFindingRefactoring", "", 2000, "", "", ""))
        list.add(Paper("Deme97bDesignGuidelines", "", 1997, "", "", ""))
        list.add(Paper("Deme99aDemeyerDucasseLMO99", "", 1999, "", "", ""))
        list.add(Paper("Denk06aRuntimeByteCodeESUGJournal", "", 2006, "", "", ""))
        list.add(Paper("Denk10a-Models10-FeatureModels", "", 2010, "", "", ""))
        list.add(Paper("Duca01aTowardsAMethod", "", 2001, "", "", ""))
        list.add(Paper("Duca04aRuntimePolymetricViewsSCG", "", 2004, "", "", ""))
        list.add(Paper("Gael04aOrderingBrokenUnitTestsForFocusedDebugging", "", 2004, "", "", ""))
        list.add(Paper("Gael04dCorrelatingUnitTestsAndMethodsUnderTest", "", 2004, "", "", ""))
        list.add(Paper("Girb04dEntitiesChangeTogether", "", 2005, "", "", ""))
        list.add(Paper("Girb05bMetaModelTransATEM2004", "", 2005, "", "", ""))
        list.add(Paper("Girb15b-PervasiveSoftwareVisualizations", "", 2015, "", "", ""))
        list.add(Paper("Gree05aCSMR2005FeaturesIEEEButInBadState", "", 2005, "", "", ""))
        list.add(Paper("Haen14a-QuantitativeEcosystemInformationNeeds", "", 2014, "", "", ""))
        list.add(Paper("Hamo07a-pcoda2007proceedings", "", 2007, "", "", ""))
        list.add(Paper("Hofe06aUnstuckNode", "", 2006, "", "", ""))
        list.add(Paper("Kuhn05bHapaxPCODA2005", "", 2005, "", "", ""))
        list.add(Paper("Kuhn09aLogLikelihoodRatio", "", 2009, "", "", ""))
        list.add(Paper("Kuhn10c-softvis2010-kuhn-codemap-userstudy", "", 2010, "", "", ""))
        list.add(Paper("Lanz02bModelIndependentMetrics", "", 2002, "", "", ""))
        list.add(Paper("Lien06aCapturingHowObjectsFlowPCODA06", "", 2006, "", "", ""))
        list.add(Paper("Lien11aDynamicAnalysis", "", 2011, "", "", ""))
        list.add(Paper("Lung07bSmallProjectObservatory", "", 2007, "", "", ""))
        list.add(Paper("Lung07cSuperRepositories", "", 2007, "", "", ""))
        list.add(Paper("Lung09aSPO", "", 2009, "", "", ""))
        list.add(Paper("Lung09b", "", 2009, "", "", ""))
        list.add(Paper("Lung10a", "", 2010, "", "", ""))
        list.add(Paper("Lung13a-Planning", "", 2013, "", "", ""))
        list.add(Paper("Lung14a", "", 2014, "", "", ""))
        list.add(Paper("Mari05aSAIL", "", 2005, "", "", ""))
        list.add(Paper("Matt09aAssigningBugreports", "", 2009, "", "", ""))
        list.add(Paper("Meij97bBeyondObjects", "", 1997, "", "", ""))
        list.add(Paper("Mens99a", "", 1999, "", "", ""))
        list.add(Paper("Meri15a-DRAFT", "", 2015, "", "", ""))
        list.add(Paper("Meye06aMondrian", "", 2006, "", "", ""))
        list.add(Paper("Nier00cAgentsEverywhere", "", 2000, "", "", ""))
        list.add(Paper("Nier03cPiccolaCalculus", "", 2003, "", "", ""))
        list.add(Paper("Nier08bChangeEnabledSoftware", "", 2008, "", "", ""))
        list.add(Paper("Peri09aEnablingevolutionOfJEAs", "", 2009, "", "", ""))
        list.add(Paper("Poll07a-CSMRSARTaxonomy", "", 2007, "", "", ""))
        list.add(Paper("Reng09bLanguageShootout", "", 2009, "", "", ""))
        list.add(Paper("Reng10bDomainSpecificProgramChecking", "", 2010, "", "", ""))
        list.add(Paper("Ress12a-ObjectCentricDebugging", "", 2012, "", "", ""))
        list.add(Paper("Roet08eDynamicDependenciesIDE", "", 2008, "", "", ""))
        list.add(Paper("Scha02cTraitsModel", "", 2002, "", "", ""))
        list.add(Paper("Schn16a", "", 2016, "", "", ""))
        list.add(Paper("Schu12a-clone-representation", "", 2012, "", "", ""))
        list.add(Paper("Schw11aSeuss-Springer", "", 2011, "", "", ""))
        list.add(Paper("Schw11bDoodleDebug", "", 2011, "", "", ""))
        list.add(Paper("Seeb06bChronia", "", 2006, "", "", ""))
        list.add(Paper("Thal06aJamTomorrow", "", 2006, "", "", ""))
        list.add(Paper("Tich00aDesignGuidelines", "", 2000, "", "", ""))
        list.add(Paper("Tich99mSniffToRationalRose", "", 1999, "", "", ""))
        list.add(Paper("Vasa08aResilienceToChange", "", 2009, "", "", ""))
        list.add(Paper("Vasa09aGiniICSM", "", 2009, "", "", ""))
        list.add(Paper("Verb08aQTAPC2008", "", 2008, "", "", ""))
        list.add(Paper("Verw09aSafeReflectionThroughPolymorphism", "", 2009, "", "", ""))
        list.add(Paper("Verw11aRuntimeUpdates", "", 2011, "", "", ""))
        list.add(Paper("Verw11bFlexibleObjectLayouts", "", 2011, "", "", ""))
        list.add(Paper("Vran12a", "", 2012, "", "", ""))
        list.add(Paper("Weih05aHigherOrderMessagingOOPSLA2005", "", 2005, "", "", ""))
        list.add(Paper("Wern11aActiveContext", "", 2011, "", "", ""))
        list.add(Paper("Wern12a", "", 2012, "", "", ""))
        list.add(Paper("Wern12b", "", 2012, "", "", ""))
        list.add(Paper("Wern12c", "", 2012, "", "", ""))
        list.add(Paper("Wern14a", "", 2014, "", "", ""))
        list.add(Paper("Wint02aPecosApproach", "", 2002, "", "", ""))
        list.add(Paper("Wuyt01a", "", 2001, "", "", ""))
        list.add(Paper("Wuyt01c", "", 2001, "", "", ""))
        list.add(Paper("Wuyt01d", "", 2001, "", "", ""))
        list.add(Paper("Wuyt01e", "", 2001, "", "", ""))
        list.add(Paper("Wuyt01f", "", 2001, "", "", ""))
        list.add(Paper("Wuyt01g", "", 2001, "", "", ""))
        list.add(Paper("Wuyt01h", "", 2001, "", "", ""))
        list.add(Paper("Wuyt03bClassifications", "", 2003, "", "", ""))
        list.add(Paper("Wuyt04aClassificationsSCG", "", 2004, "", "", ""))
        list.add(Paper("Wuyt04x-OOR04Report", "", 2004, "", "", ""))
        list.add(Paper("Wuyt05aPecosElsevier", "", 2005, "", "", ""))
        list.add(Paper("Wuyt96a", "", 1996, "", "", ""))
        list.add(Paper("Wuyt99a", "", 1999, "", "", ""))
        list.add(Paper("Zaid06a-pcoda2006proceedings", "", 2006, "", "", ""))
        list.add(Paper("Zaid08a-pcoda2008proceedings", "", 2008, "", "", ""))
    }

    fun printCSV(){
        println("undefined,filename,type,title,contributor1,contributor2,contributor3,contributor4,contributor5,contributor6,contributor7,contributor8,contributor9,contributor10,year")
        for (paper in list){
            println(paper)
        }
    }

}

fun main(args: Array<String>){
    GroundTruthBuilder().printCSV()
}