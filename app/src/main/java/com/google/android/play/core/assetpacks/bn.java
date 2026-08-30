package com.google.android.play.core.assetpacks;

import a5.a;
import android.os.Bundle;
import g5.q;
import lb.f1;
import lb.n0;
import lb.u;
import ya.j1;

/* loaded from: classes.dex */
public final class bn {

    /* renamed from: a, reason: collision with root package name */
    public final String f15575a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15576b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15577c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15578d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15579f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15580g;

    /* renamed from: h, reason: collision with root package name */
    public final String f15581h;
    public final String i;

    public bn(String str, int i, int i10, long j10, long j11, int i11, int i12, String str2, String str3) {
        if (str != null) {
            this.f15575a = str;
            this.f15576b = i;
            this.f15577c = i10;
            this.f15578d = j10;
            this.e = j11;
            this.f15579f = i11;
            this.f15580g = i12;
            if (str2 != null) {
                this.f15581h = str2;
                if (str3 != null) {
                    this.i = str3;
                    return;
                } else {
                    q.h("Null installedVersionTag");
                    throw null;
                }
            }
            q.h("Null availableVersionTag");
            throw null;
        }
        q.h("Null name");
        throw null;
    }

    public static bn a(Bundle bundle, String str, n0 n0Var, f1 f1Var, u uVar) {
        int a10 = uVar.a(bundle.getInt(j1.a("status", str)), str);
        int i = bundle.getInt(j1.a("error_code", str));
        long j10 = bundle.getLong(j1.a("bytes_downloaded", str));
        long j11 = bundle.getLong(j1.a("total_bytes_to_download", str));
        double a11 = n0Var.a(str);
        long j12 = bundle.getLong(j1.a("pack_version", str));
        long j13 = bundle.getLong(j1.a("pack_base_version", str));
        int i10 = 1;
        if (a10 == 4) {
            if (j13 != 0 && j13 != j12) {
                i10 = 2;
            }
            a10 = 4;
        }
        return new bn(str, a10, i, j10, j11, (int) Math.rint(a11 * 100.0d), i10, bundle.getString(j1.a("pack_version_tag", str), String.valueOf(bundle.getInt("app_version_code"))), f1Var.a(str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bn) {
            bn bnVar = (bn) obj;
            if (this.f15575a.equals(bnVar.f15575a) && this.f15576b == bnVar.f15576b && this.f15577c == bnVar.f15577c && this.f15578d == bnVar.f15578d && this.e == bnVar.e && this.f15579f == bnVar.f15579f && this.f15580g == bnVar.f15580g && this.f15581h.equals(bnVar.f15581h) && this.i.equals(bnVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f15575a.hashCode() ^ 1000003;
        long j10 = this.e;
        long j11 = j10 ^ (j10 >>> 32);
        long j12 = this.f15578d;
        return (((((((((((((((hashCode * 1000003) ^ this.f15576b) * 1000003) ^ this.f15577c) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003) ^ ((int) j11)) * 1000003) ^ this.f15579f) * 1000003) ^ this.f15580g) * 1000003) ^ this.f15581h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AssetPackState{name=");
        sb2.append(this.f15575a);
        sb2.append(", status=");
        sb2.append(this.f15576b);
        sb2.append(", errorCode=");
        sb2.append(this.f15577c);
        sb2.append(", bytesDownloaded=");
        sb2.append(this.f15578d);
        sb2.append(", totalBytesToDownload=");
        sb2.append(this.e);
        sb2.append(", transferProgressPercentage=");
        sb2.append(this.f15579f);
        sb2.append(", updateAvailability=");
        sb2.append(this.f15580g);
        sb2.append(", availableVersionTag=");
        sb2.append(this.f15581h);
        sb2.append(", installedVersionTag=");
        return a.k(sb2, this.i, "}");
    }
}
