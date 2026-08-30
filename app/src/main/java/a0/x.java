package a0;
import z.j;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import z1.z0;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f153u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ArrayList f154v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f155w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(ArrayList arrayList, List list, boolean z3, int i) {
        super(1);
        this.f153u = i;
        this.f154v = arrayList;
        this.f155w = list;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f153u) {
            case 0:
                z0 z0Var = (z0) obj;
                ArrayList arrayList = this.f154v;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((a0) arrayList.get(i)).a(z0Var);
                }
                Object r02 = this.f155w;
                int size2 = ((Collection) r02).size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ((a0) r02.get(i10)).a(z0Var);
                }
                return pe.z.f22715a;
            default:
                z0 z0Var2 = (z0) obj;
                ArrayList arrayList2 = this.f154v;
                int size3 = arrayList2.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    ((j) arrayList2.get(i11)).a(z0Var2);
                }
                Object r03 = this.f155w;
                int size4 = ((Collection) r03).size();
                for (int i12 = 0; i12 < size4; i12++) {
                    ((j) r03.get(i12)).a(z0Var2);
                }
                return pe.z.f22715a;
        }
    }
}