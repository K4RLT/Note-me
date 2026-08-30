package cg;

import fg.q;
import java.util.ArrayList;
import java.util.HashSet;
import qe.s;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f4105a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4106b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f4107c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4108d = new ArrayList();
    public final ArrayList e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4109f = new ArrayList();

    public a(String str) {
        this.f4105a = str;
    }

    public static void a(a aVar, String str, q qVar) {
        aVar.getClass();
        if (aVar.f4107c.add(str)) {
            aVar.f4106b.add(str);
            aVar.f4108d.add(qVar);
            aVar.e.add(s.f24023u);
            aVar.f4109f.add(false);
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + str + "' is already registered in " + aVar.f4105a).toString());
    }
}
