module appstart {

    requires appfuncs;
    requires appsupport;
    requires userfuncs;

    uses userfuncs.binaryfuncs.BinFuncProvider;
}