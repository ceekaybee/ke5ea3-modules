module module.c {
    requires module.b;
    // requires module.a; has no effect because module.a does not export a to module.c
}