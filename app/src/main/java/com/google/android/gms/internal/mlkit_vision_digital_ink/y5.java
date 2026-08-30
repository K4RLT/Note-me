package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g3.a;
import q.x;
import qc.h1;
import x.o;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class y5 {

    /* renamed from: a, reason: collision with root package name */
    public int f15275a;

    /* renamed from: b, reason: collision with root package name */
    public String f15276b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15277c;

    /* renamed from: d, reason: collision with root package name */
    public byte f15278d;
    public Serializable e;

    public qc.h1 a() {
        String str;
        String str2;
        if (this.f15278d == 3 && (str = this.f15276b) != null && (str2 = (String) this.e) != null) {
            return new qc.h1(str, this.f15275a, str2, this.f15277c);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f15278d & 1) == 0) {
            sb2.append(" platform");
        }
        if (this.f15276b == null) {
            sb2.append(" version");
        }
        if (((String) this.e) == null) {
            sb2.append(" buildVersion");
        }
        if ((this.f15278d & 2) == 0) {
            sb2.append(" jailbroken");
        }
        q.x.o(g3.a.l("Missing required properties:", sb2));
        return null;
    }

    public y6 b() {
        String str;
        int i;
        if (this.f15278d == 15 && (str = this.f15276b) != null && (i = this.f15275a) != 0) {
            return new y6(str, (q2) this.e, i, this.f15277c);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f15276b == null) {
            sb2.append(" groupName");
        }
        if ((this.f15278d & 1) == 0) {
            sb2.append(" groupSizeBytes");
        }
        if ((this.f15278d & 2) == 0) {
            sb2.append(" groupSizeBytesLong");
        }
        if (this.f15275a == 0) {
            sb2.append(" showNotifications");
        }
        if ((this.f15278d & 4) == 0) {
            sb2.append(" preserveZipDirectories");
        }
        if ((this.f15278d & 8) == 0) {
            sb2.append(" verifyIsolatedStructure");
        }
        q.x.o("Missing required properties:".concat(sb2.toString()));
        return null;
    }
}
