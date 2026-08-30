package com.google.firebase.concurrent;

import com.google.android.gms.internal.ads.yh0;
import com.google.firebase.components.ComponentRegistrar;
import g5.q;
import hc.a;
import hc.b;
import hc.c;
import hc.d;
import ic.f;
import ic.n;
import ic.r;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import wa.j8;

/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final n f15588a = new n(new f(2));

    /* renamed from: b, reason: collision with root package name */
    public static final n f15589b = new n(new f(3));

    /* renamed from: c, reason: collision with root package name */
    public static final n f15590c = new n(new f(4));

    /* renamed from: d, reason: collision with root package name */
    public static final n f15591d = new n(new f(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        r rVar = new r(a.class, ScheduledExecutorService.class);
        r[] rVarArr = {new r(a.class, ExecutorService.class), new r(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            j8.a(rVar2, "Null interface");
        }
        Collections.addAll(hashSet, rVarArr);
        ic.a aVar = new ic.a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new q(15), hashSet3);
        r rVar3 = new r(b.class, ScheduledExecutorService.class);
        r[] rVarArr2 = {new r(b.class, ExecutorService.class), new r(b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(rVar3);
        for (r rVar4 : rVarArr2) {
            j8.a(rVar4, "Null interface");
        }
        Collections.addAll(hashSet4, rVarArr2);
        ic.a aVar2 = new ic.a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new q(16), hashSet6);
        r rVar5 = new r(c.class, ScheduledExecutorService.class);
        r[] rVarArr3 = {new r(c.class, ExecutorService.class), new r(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(rVar5);
        for (r rVar6 : rVarArr3) {
            j8.a(rVar6, "Null interface");
        }
        Collections.addAll(hashSet7, rVarArr3);
        ic.a aVar3 = new ic.a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new q(17), hashSet9);
        yh0 a10 = ic.a.a(new r(d.class, Executor.class));
        a10.f12883z = new q(18);
        return Arrays.asList(aVar, aVar2, aVar3, a10.b());
    }
}
