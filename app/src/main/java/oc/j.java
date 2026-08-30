package oc;

import c0.z;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final z f21887a;

    /* renamed from: b, reason: collision with root package name */
    public final i f21888b;

    public j(z zVar, tc.c cVar) {
        this.f21887a = zVar;
        this.f21888b = new i(cVar);
    }

    public final void a(String str) {
        i iVar = this.f21888b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f21885b, str)) {
                i.a(iVar.f21884a, str, iVar.f21886c);
                iVar.f21885b = str;
            }
        }
    }
}
