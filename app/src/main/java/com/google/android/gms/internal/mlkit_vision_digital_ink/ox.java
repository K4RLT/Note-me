package com.google.android.gms.internal.mlkit_vision_digital_ink;
import ra.e;

import java.io.File;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ox {

    /* renamed from: a, reason: collision with root package name */
    public final String f14769a;

    /* renamed from: b, reason: collision with root package name */
    public final File f14770b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14771c;

    /* renamed from: d, reason: collision with root package name */
    public final c f14772d;
    public final com.google.android.gms.internal.measurement.e4 e;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14774g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f14775h;

    /* renamed from: k, reason: collision with root package name */
    public nx f14777k;

    /* renamed from: m, reason: collision with root package name */
    public final s5 f14779m;

    /* renamed from: f, reason: collision with root package name */
    public final k3 f14773f = new k3();
    public int i = 0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14776j = false;

    /* renamed from: l, reason: collision with root package name */
    public int f14778l = -1;

    public ox(c cVar, String str, File file, String str2, s5 s5Var, com.google.android.gms.internal.measurement.e4 e4Var) {
        this.f14777k = nx.f14724u;
        this.f14769a = str;
        this.f14770b = file;
        this.f14771c = str2;
        this.f14779m = s5Var;
        this.f14772d = cVar;
        this.e = e4Var;
        boolean startsWith = str.startsWith("data:");
        this.f14774g = startsWith;
        boolean startsWith2 = str.startsWith("file:");
        this.f14775h = startsWith2;
        if (!startsWith2 && !startsWith) {
            return;
        }
        this.f14777k = nx.f14726w;
    }

    public static boolean g(String str) {
        return str.startsWith("file:");
    }

    public final int a() {
        return this.f14778l;
    }

    public final com.google.android.gms.internal.measurement.e4 b() {
        return this.e;
    }

    public final File c() {
        return this.f14770b;
    }

    public final String d() {
        return this.f14771c;
    }

    public final String e() {
        return this.f14769a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ox) {
            ox oxVar = (ox) obj;
            if (Objects.equals(this.f14769a, oxVar.f14769a) && Objects.equals(this.f14770b, oxVar.f14770b) && Objects.equals(this.f14771c, oxVar.f14771c) && Objects.equals(this.f14777k, oxVar.f14777k) && this.f14776j == oxVar.f14776j) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final synchronized boolean f() {
        return this.f14776j;
    }

    public final s5 h() {
        return this.f14779m;
    }

    public final int hashCode() {
        return Objects.hash(this.f14769a, this.f14770b, this.f14771c, this.f14777k, Boolean.valueOf(this.f14776j));
    }

    public final String toString() {
        ra.e eVar = new ra.e(ox.class.getSimpleName(), 15);
        ra.e eVar2 = new ra.e(14, false);
        ((ra.e) eVar.f24677x).f24677x = eVar2;
        eVar2.f24676w = this.f14769a;
        eVar2.f24675v = "";
        int i = 14;
        boolean z3 = false;
        ra.e eVar3 = new ra.e(i, z3);
        eVar2.f24677x = eVar3;
        eVar3.f24676w = this.f14770b;
        eVar3.f24675v = "targetDirectory";
        ra.e eVar4 = new ra.e(i, z3);
        eVar3.f24677x = eVar4;
        eVar4.f24676w = this.f14771c;
        eVar4.f24675v = "fileName";
        nx nxVar = this.f14777k;
        ra.e eVar5 = new ra.e(14, false);
        eVar4.f24677x = eVar5;
        eVar.f24677x = eVar5;
        eVar5.f24676w = nxVar;
        eVar5.f24675v = "requiredConnectivity";
        String valueOf = String.valueOf(this.f14776j);
        ra.e eVar6 = new ra.e(14, false);
        ((ra.e) eVar.f24677x).f24677x = eVar6;
        eVar.f24677x = eVar6;
        eVar6.f24676w = valueOf;
        eVar6.f24675v = "canceled";
        return eVar.toString();
    }
}
