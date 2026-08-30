package com.google.android.gms.internal.mlkit_vision_digital_ink;
import a5.a;
import g3.a;

import android.net.Uri;

/* loaded from: classes.dex */
public final class ft {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f14315a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14316b;

    /* renamed from: c, reason: collision with root package name */
    public final et f14317c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14318d;
    public final z4 e;

    /* renamed from: f, reason: collision with root package name */
    public final om f14319f;

    public ft(Uri uri, String str, et etVar, int i, z4 z4Var, om omVar) {
        this.f14315a = uri;
        this.f14316b = str;
        this.f14317c = etVar;
        this.f14318d = i;
        this.e = z4Var;
        this.f14319f = omVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ft) {
                ft ftVar = (ft) obj;
                if (this.f14315a.equals(ftVar.f14315a) && this.f14316b.equals(ftVar.f14316b) && this.f14317c.equals(ftVar.f14317c) && this.f14318d == ftVar.f14318d && this.e.equals(ftVar.e) && this.f14319f.equals(ftVar.f14319f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((this.f14315a.hashCode() ^ 1000003) * 1000003) ^ this.f14316b.hashCode()) * 1000003) ^ this.f14317c.hashCode()) * 1000003) ^ this.f14318d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.f14319f.hashCode();
    }

    public final String toString() {
        String obj = this.f14315a.toString();
        String etVar = this.f14317c.toString();
        String obj2 = this.e.toString();
        String nnVar = this.f14319f.toString();
        StringBuilder sb2 = new StringBuilder("DownloadRequest{fileUri=");
        sb2.append(obj);
        sb2.append(", urlToDownload=");
        a.t(sb2, this.f14316b, ", downloadConstraints=", etVar, ", trafficTag=");
        sb2.append(this.f14318d);
        sb2.append(", extraHttpHeaders=");
        sb2.append(obj2);
        sb2.append(", inlineDownloadParamsOptional=Optional.absent(), customDownloaderMetadata=");
        return a.k(sb2, nnVar, "}");
    }
}
