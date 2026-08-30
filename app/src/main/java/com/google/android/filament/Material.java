package com.google.android.filament;
import d.c;

import java.nio.Buffer;
import java.util.List;
import q.x;

/* loaded from: classes.dex */
public class Material {

    /* renamed from: a, reason: collision with root package name */
    public long f4222a;

    /* loaded from: classes.dex */
    public static class Parameter {

        /* renamed from: a, reason: collision with root package name */
        public static final int[] f4223a = q0.c(24);
        private static final int SAMPLER_OFFSET = 18;
        private static final int SUBPASS_OFFSET = 23;

        /* JADX WARN: Multi-variable type inference failed */
        private static void add(List<Parameter> list, String str, int i, int i10, int i11) {
            int i12 = f4223a[i];
            int i13 = q0.c(4)[i10];
            list.add(new Object());
        }
    }

    public Material(long j10) {
        this.f4222a = j10;
        nGetDefaultInstance(j10);
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, Buffer buffer, int i);

    private static native long nCreateInstance(long j10);

    private static native long nGetDefaultInstance(long j10);

    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.filament.MaterialInstance, java.lang.Object] */
    public final MaterialInstance b() {
        long nCreateInstance = nCreateInstance(c());
        if (nCreateInstance != 0) {
            Object obj = new Object();
            c();
            obj.f4224a = nCreateInstance;
            return obj;
        }
        x.o("Couldn't create MaterialInstance");
        return null;
    }

    public final long c() {
        long j10 = this.f4222a;
        if (j10 != 0) {
            return j10;
        }
        x.o("Calling method on destroyed Material");
        return 0L;
    }
}