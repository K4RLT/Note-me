package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.io.Serializable;
import java.util.Random;
import java.util.logging.Level;

/* loaded from: classes.dex */
public abstract class cx {

    /* renamed from: a, reason: collision with root package name */
    public static final Random f14175a = new Random();

    public static void a(String str, String str2) {
        s5 s5Var = bx.f14126a;
        s5Var.getClass();
        Level level = Level.FINE;
        ((p5) s5Var.f(level).b(62, "d")).d(str2, str);
        s5Var.f(level).j();
    }

    public static void b(String str, Object... objArr) {
        s5 s5Var = bx.f14126a;
        s5Var.getClass();
        Level level = Level.FINE;
        ((p5) s5Var.f(level).b(76, "d")).c(str, objArr);
        s5Var.f(level).j();
    }

    public static void c(String str, String str2, Object obj) {
        s5 s5Var = bx.f14126a;
        s5Var.getClass();
        Level level = Level.FINE;
        ((p5) s5Var.f(level).b(69, "d")).a(str, str2, obj);
        s5Var.f(level).j();
    }

    public static void d(Throwable th, String str, Object... objArr) {
        s5 s5Var = bx.f14126a;
        s5Var.getClass();
        Level level = Level.FINE;
        ((p5) ((p5) s5Var.f(level).e(th)).b(83, "d")).c(str, objArr);
        s5Var.f(level).j();
    }

    public static void e(String str) {
        s5 s5Var = bx.f14126a;
        s5Var.getClass();
        Level level = Level.SEVERE;
        ((p5) s5Var.f(level).b(116, "e")).d(str, "%s");
        s5Var.f(level).j();
    }

    public static void f(String str, Serializable serializable) {
        s5 s5Var = bx.f14126a;
        s5Var.getClass();
        Level level = Level.SEVERE;
        ((p5) s5Var.f(level).b(123, "e")).d(serializable, str);
        s5Var.f(level).j();
    }

    public static void g(String str, Object... objArr) {
        s5 s5Var = bx.f14126a;
        s5Var.getClass();
        Level level = Level.SEVERE;
        ((p5) s5Var.f(level).b(137, "e")).c(str, objArr);
        s5Var.f(level).j();
    }

    public static void h(Exception exc, String str) {
        s5 s5Var = bx.f14126a;
        s5Var.getClass();
        Level level = Level.SEVERE;
        ((p5) ((p5) s5Var.f(level).e(exc)).b(144, "e")).d(str, "%s");
        s5Var.f(level).j();
    }

    public static void i(String str, String str2, Object obj) {
        s5 s5Var = bx.f14126a;
        s5Var.getClass();
        Level level = Level.SEVERE;
        ((p5) s5Var.f(level).b(130, "e")).a(str, str2, obj);
        s5Var.f(level).j();
    }

    public static void j(Throwable th, String str, Object... objArr) {
        s5 s5Var = bx.f14126a;
        s5Var.getClass();
        Level level = Level.SEVERE;
        ((p5) ((p5) s5Var.f(level).e(th)).b(151, "e")).c(str, objArr);
        s5Var.f(level).j();
    }

    public static void k(String str, Object... objArr) {
        s5 s5Var = bx.f14126a;
        s5Var.getClass();
        Level level = Level.FINER;
        ((p5) s5Var.f(level).b(49, "v")).c(str, objArr);
        s5Var.f(level).j();
    }

    public static void l(String str, String str2) {
        s5 s5Var = bx.f14126a;
        s5Var.getClass();
        Level level = Level.FINER;
        ((p5) s5Var.f(level).b(42, "v")).a(str, "DownloadFutureMap", str2);
        s5Var.f(level).j();
    }

    public static void m(String str) {
        s5 s5Var = bx.f14126a;
        s5Var.getClass();
        Level level = Level.WARNING;
        ((p5) s5Var.f(level).b(164, "w")).d("MDDManager", str);
        s5Var.f(level).j();
    }
}
