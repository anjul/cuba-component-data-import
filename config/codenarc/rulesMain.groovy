ruleset {


    IllegalClassReference {
        name = 'CUBADoNotReferenceLoadContextInController'
        priority = 1
        classNames = 'com.haulmont.cuba.core.global.LoadContext'
        applyToClassNames = '*Browse, *Edit, *Dialog*'
        description = '[CUBA] LoadContext should not be used in a CUBA Controller. Try to shift this logic into a Service instead.'
        description = '[CUBA] LoadContext should not be used in a CUBA Controller. Try to shift this logic into a Service instead.'
    }

//    IllegalString {
//        name = 'CUBADoNotUseMetadataCreateInController'
//        string = 'metadata.create'
//        applyToFileNames = '*Browse.groovy, *Edit.groovy, *Dialog*.groovy'
//        priority = 1
//        violationMessage = '[CUBA] Metadata should not be used in Controller, because the REST API will not get these information'
//        description = '[CUBA] Metadata should not be used in Controller, because the REST API will not get these information. Consider @PostConstruct in Entity. See <a href="https://doc.cuba-platform.com/manual-6.4/init_values.html">CUBA docs</a>'
//    }


    MethodSize {
        maxLines = 25
        priority = 1
    }
    MethodCount {
        maxMethods = 25
        priority = 1
    }
    CatchError { priority = 1 }

    CyclomaticComplexity {
        maxMethodComplexity = 10
        maxClassAverageMethodComplexity = 10
        priority = 1
    }
    ImportFromSunPackages { priority = 1 }
    CatchArrayIndexOutOfBoundsException { priority = 1 }

    NestedBlockDepth {
        maxNestedBlockDepth = 3
        priority = 1
    }
    DuplicateImport { priority = 1 }
    ClosureAsLastMethodParameter { priority = 1 }
    ClassNameSameAsFilename { priority = 1 }
    ImportFromSamePackage { priority = 1 }



    ClassNameSameAsSuperclass { priority = 1 }
    AssignCollectionSort { priority = 1 }
    AssignCollectionUnique { priority = 1 }
    ParameterCount { maxParameters = 5 }
    CollectAllIsDeprecated { priority = 1 }
    ConfusingMultipleReturns { priority = 1 }
    ExplicitArrayListInstantiation { priority = 1 }
    ExplicitCallToAndMethod { priority = 1 }
    ExplicitCallToCompareToMethod { priority = 1 }
    ExplicitCallToDivMethod { priority = 1 }
    ExplicitCallToEqualsMethod { priority = 1 }
    ExplicitCallToGetAtMethod { priority = 1 }
    ExplicitCallToLeftShiftMethod { priority = 1 }
    ExplicitCallToMinusMethod { priority = 1 }
    ExplicitCallToModMethod { priority = 1 }
    ExplicitCallToMultiplyMethod { priority = 1 }
    ExplicitCallToOrMethod { priority = 1 }
    ExplicitCallToPlusMethod { priority = 1 }
    ExplicitCallToPowerMethod { priority = 1 }
    ExplicitCallToRightShiftMethod { priority = 1 }
    ExplicitCallToXorMethod { priority = 1 }
    ExplicitHashMapInstantiation { priority = 1 }
    ExplicitHashSetInstantiation { priority = 1 }
    ExplicitLinkedHashMapInstantiation { priority = 1 }
    ExplicitLinkedListInstantiation { priority = 1 }
    ExplicitStackInstantiation { priority = 1 }
    ExplicitTreeSetInstantiation { priority = 1 }
    GStringAsMapKey { priority = 1 }
    GStringExpressionWithinString { priority = 1 }
    GetterMethodCouldBeProperty { priority = 1 }
    GroovyLangImmutable { priority = 1 }
    UseCollectMany { priority = 1 }
    UseCollectNested { priority = 1 }
    UnusedArray { priority = 1 }
    UnusedMethodParameter { priority = 1 }
    UnusedObject { priority = 1 }
    UnusedPrivateField { priority = 1 }
    UnusedPrivateMethod { priority = 1 }
    UnusedPrivateMethodParameter { priority = 1 }
    UnusedVariable { priority = 1 }
    EnumCustomSerializationIgnored { priority = 1 }
    SerialPersistentFields { priority = 1 }
    SerialVersionUID { priority = 1 }
    SerializableClassMustDefineSerialVersionUID { priority = 1 }
    LoggerForDifferentClass { priority = 1 }
    LoggerWithWrongModifiers { priority = 1 }
    LoggingSwallowsStacktrace { priority = 1 }
    MultipleLoggers { priority = 1 }
    PrintStackTrace { priority = 1 }
    Println { priority = 1 }
    SystemErrPrint { priority = 1 }
    SystemOutPrint { priority = 1 }
    BusyWait { priority = 1 }
    DoubleCheckedLocking { priority = 1 }
    InconsistentPropertyLocking { priority = 1 }
    InconsistentPropertySynchronization { priority = 1 }
    NestedSynchronization { priority = 1 }
    StaticCalendarField { priority = 1 }
    StaticConnection { priority = 1 }
    StaticDateFormatField { priority = 1 }
    StaticMatcherField { priority = 1 }
    StaticSimpleDateFormatField { priority = 1 }
    SynchronizedMethod { priority = 1 }
    SynchronizedOnBoxedPrimitive { priority = 1 }
    SynchronizedOnGetClass { priority = 1 }
    SynchronizedOnReentrantLock { priority = 1 }
    SynchronizedOnString { priority = 1 }
    SynchronizedOnThis { priority = 1 }
    SynchronizedReadObjectMethod { priority = 1 }
    SystemRunFinalizersOnExit { priority = 1 }
    // ThisReferenceEscapesConstructor { priority = 1 }
    ThreadGroup { priority = 1 }
    ThreadLocalNotStaticFinal { priority = 1 }
    ThreadYield { priority = 1 }
    UseOfNotifyMethod { priority = 1 }
    VolatileArrayField { priority = 1 }
    VolatileLongOrDoubleField { priority = 1 }
    WaitOutsideOfWhileLoop { priority = 1 }
    ThrowExceptionFromFinallyBlock { priority = 1 }
    CatchIllegalMonitorStateException { priority = 1 }
    CatchIndexOutOfBoundsException { priority = 1 }
    CatchNullPointerException { priority = 1 }
    CatchRuntimeException { priority = 1 }
    CatchThrowable { priority = 1 }
    ConfusingClassNamedException { priority = 1 }
    ExceptionExtendsError { priority = 1 }
    ExceptionExtendsThrowable { priority = 1 }
    ExceptionNotThrown { priority = 1 }
    MissingNewInThrowStatement { priority = 1 }
    ReturnNullFromCatchBlock { priority = 1 }
    SwallowThreadDeath { priority = 1 }
    ThrowError { priority = 1 }
    ThrowException { priority = 1 }
    ThrowNullPointerException { priority = 1 }
    ThrowRuntimeException { priority = 1 }
    ThrowThrowable { priority = 1 }
    DuplicateListLiteral { priority = 1 }
    DuplicateMapLiteral { priority = 1 }
    DuplicateNumberLiteral { priority = 1 }
    DuplicateStringLiteral { priority = 1 }
    AbstractClassWithPublicConstructor { priority = 1 }
    AbstractClassWithoutAbstractMethod { priority = 1 }
    AssignmentToStaticFieldFromInstanceMethod { priority = 1 }
    BooleanMethodReturnsNull { priority = 1 }
    BuilderMethodWithSideEffects { priority = 1 }
    CloneableWithoutClone { priority = 1 }
    CloseWithoutCloseable { priority = 1 }
    CompareToWithoutComparable { priority = 1 }
//    ConstantsOnlyInterface  { priority = 1 }
    EmptyMethodInAbstractClass { priority = 1 }
    FinalClassWithProtectedMember { priority = 1 }
    ImplementationAsType { priority = 1 }
    LocaleSetDefault { priority = 1 }
    NestedForLoop { priority = 1 }
    PrivateFieldCouldBeFinal { priority = 1 }
    PublicInstanceField { priority = 1 }
    ReturnsNullInsteadOfEmptyArray { priority = 1 }
    ReturnsNullInsteadOfEmptyCollection { priority = 1 }
    SimpleDateFormatMissingLocale { priority = 1 }
    StatelessSingleton { priority = 1 }
    ToStringReturnsNull { priority = 1 }
    ConfusingTernary { priority = 1 }
    CouldBeElvis { priority = 1 }
    HashtableIsObsolete { priority = 1 }
    IfStatementCouldBeTernary { priority = 1 }
    InvertedIfElse { priority = 1 }
    LongLiteralWithLowerCaseL { priority = 1 }
//    NoTabCharacter  { priority = 1 }
    ParameterReassignment { priority = 1 }
    TernaryCouldBeElvis { priority = 1 }
//    TrailingComma  { priority = 1 }
    VectorIsObsolete { priority = 1 }
    ElseBlockBraces { priority = 1 }
    ForStatementBraces { priority = 1 }
    IfStatementBraces { priority = 1 }
    WhileStatementBraces { priority = 1 }
    AssertWithinFinallyBlock { priority = 1 }
    AssignmentInConditional { priority = 1 }
    BigDecimalInstantiation { priority = 1 }
    BitwiseOperatorInConditional { priority = 1 }
    BooleanGetBoolean { priority = 1 }
    BrokenNullCheck { priority = 1 }
    BrokenOddnessCheck { priority = 1 }
    ClassForName { priority = 1 }
    ComparisonOfTwoConstants { priority = 1 }
    ComparisonWithSelf { priority = 1 }
    ConstantAssertExpression { priority = 1 }
    ConstantIfExpression { priority = 1 }
    ConstantTernaryExpression { priority = 1 }
    DeadCode { priority = 1 }
    DoubleNegative { priority = 1 }
    DuplicateCaseStatement { priority = 1 }
    DuplicateMapKey { priority = 1 }
    DuplicateSetValue { priority = 1 }
    ReturnFromFinallyBlock { priority = 1 }
    UnnecessaryBigIntegerInstantiation { priority = 1 }
    UnnecessaryBooleanExpression { priority = 1 }
    UnnecessaryBooleanInstantiation { priority = 1 }
    UnnecessaryCallForLastElement { priority = 1 }
    UnnecessaryCallToSubstring { priority = 1 }
    UnnecessaryCast { priority = 1 }
    UnnecessaryCatchBlock { priority = 1 }
    UnnecessaryCollectCall { priority = 1 }
    UnnecessaryCollectionCall { priority = 1 }
    UnnecessaryConstructor { priority = 1 }
    UnnecessaryDefInFieldDeclaration { priority = 1 }
    UnnecessaryDefInMethodDeclaration { priority = 1 }
    UnnecessaryDefInVariableDeclaration { priority = 1 }
    UnnecessaryDotClass { priority = 1 }
    UnnecessaryDoubleInstantiation { priority = 1 }
    UnnecessaryElseStatement { priority = 1 }
    UnnecessaryFinalOnPrivateMethod { priority = 1 }
    UnnecessaryFloatInstantiation { priority = 1 }
    UnnecessaryGString { priority = 1 }
    UnnecessaryGetter { priority = 1 }
    UnnecessaryIfStatement { priority = 1 }
    UnnecessaryInstanceOfCheck { priority = 1 }
    UnnecessaryInstantiationToGetClass { priority = 1 }
    UnnecessaryIntegerInstantiation { priority = 1 }
    UnnecessaryLongInstantiation { priority = 1 }
    UnnecessaryModOne { priority = 1 }
    UnnecessaryNullCheck { priority = 1 }
    UnnecessaryNullCheckBeforeInstanceOf { priority = 1 }
    UnnecessaryOverridingMethod { priority = 1 }
    UnnecessaryPackageReference { priority = 1 }
    UnnecessaryParenthesesForMethodCallWithClosure { priority = 1 }
    UnnecessaryPublicModifier { priority = 1 }
    UnnecessaryReturnKeyword { priority = 1 }
    UnnecessarySafeNavigationOperator { priority = 1 }
    UnnecessarySelfAssignment { priority = 1 }
    UnnecessarySemicolon { priority = 1 }
    UnnecessaryStringInstantiation { priority = 1 }
    UnnecessarySubstring { priority = 1 }
    UnnecessaryTernaryExpression { priority = 1 }
    UnnecessaryToString { priority = 1 }
    UnnecessaryTransientModifier { priority = 1 }
    EmptyCatchBlock { priority = 1 }
    EmptyClass { priority = 1 }
    EmptyElseBlock { priority = 1 }
    EmptyFinallyBlock { priority = 1 }
    EmptyForStatement { priority = 1 }
    EmptyIfStatement { priority = 1 }
    EmptyInstanceInitializer { priority = 1 }
    EmptyMethod { priority = 1 }
    EmptyStaticInitializer { priority = 1 }
    EmptySwitchStatement { priority = 1 }
    EmptySynchronizedStatement { priority = 1 }
    EmptyTryBlock { priority = 1 }
    EmptyWhileStatement { priority = 1 }
    EqualsAndHashCode { priority = 1 }
    EqualsOverloaded { priority = 1 }
    ExplicitGarbageCollection { priority = 1 }
    ForLoopShouldBeWhileLoop { priority = 1 }
    HardCodedWindowsFileSeparator { priority = 1 }
    HardCodedWindowsRootDirectory { priority = 1 }
    IntegerGetInteger { priority = 1 }
    MultipleUnaryOperators { priority = 1 }
    RandomDoubleCoercedToZero { priority = 1 }
    ConsecutiveStringConcatenation { priority = 1 }
    ConsecutiveLiteralAppends { priority = 1 }
    UnusedImport { priority = 1 }
    UnnecessaryGroovyImport { priority = 1 }
    MisorderedStaticImports { priority = 1 }
    AddEmptyString { priority = 1 }
    RemoveAllOnSelf { priority = 1 }
    UnnecessaryBigDecimalInstantiation { priority = 1 }

    ClassSize { maxLines = 300 }
}