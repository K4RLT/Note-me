package g5;
import x.o;
import c0.c;
import q.x;

import com.daren.scraply.data.local.ScraplyDatabase;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class w extends ve.i implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17544u;

    /* renamed from: v, reason: collision with root package name */
    public int f17545v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f17546w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f17547x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj, Object obj2, te.c cVar, int i) {
        super(1, cVar);
        this.f17544u = i;
        this.f17546w = obj;
        this.f17547x = obj2;
    }

    @Override // ve.a
    public final te.c create(te.c cVar) {
        switch (this.f17544u) {
            case 0:
                return new w((ScraplyDatabase) this.f17546w, (h7.h) this.f17547x, cVar, 0);
            case 1:
                return new w((j7.f) this.f17546w, (List) this.f17547x, cVar, 1);
            case 2:
                return new w((j7.f) this.f17546w, (k7.c) this.f17547x, cVar, 2);
            case 3:
                return new w((j7.f) this.f17546w, (ArrayList) this.f17547x, cVar, 3);
            case 4:
                return new w((j7.l) this.f17546w, (ArrayList) this.f17547x, cVar, 4);
            case 5:
                return new w((j7.q) this.f17546w, (k7.i) this.f17547x, cVar, 5);
            default:
                return new w((sf.h) this.f17546w, (kotlin.jvm.internal.y) this.f17547x, cVar, 6);
        }
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        te.c cVar = (te.c) obj;
        switch (this.f17544u) {
            case 0:
                return ((w) create(cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((w) create(cVar)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((w) create(cVar)).invokeSuspend(pe.z.f22715a);
            case 3:
                return ((w) create(cVar)).invokeSuspend(pe.z.f22715a);
            case 4:
                return ((w) create(cVar)).invokeSuspend(pe.z.f22715a);
            case 5:
                return ((w) create(cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((w) create(cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f17544u) {
            case 0:
                ScraplyDatabase scraplyDatabase = (ScraplyDatabase) this.f17546w;
                int i = this.f17545v;
                try {
                    if (i != 0) {
                        if (i == 1) {
                            pe.a.e(obj);
                        } else {
                            x.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        pe.a.e(obj);
                        scraplyDatabase.c();
                        h7.h hVar = (h7.h) this.f17547x;
                        this.f17545v = 1;
                        obj = hVar.invoke(this);
                        ue.a aVar = ue.a.f27192u;
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    scraplyDatabase.v();
                    return obj;
                } finally {
                    scraplyDatabase.h();
                }
            case 1:
                int i10 = this.f17545v;
                pe.z zVar = pe.z.f22715a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                        return zVar;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                j7.f fVar = (j7.f) this.f17546w;
                List list = (List) this.f17547x;
                this.f17545v = 1;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("DELETE FROM canvas_elements WHERE id IN (");
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    sb2.append("?");
                    if (i11 < size - 1) {
                        sb2.append(",");
                    }
                }
                sb2.append(")");
                Object c10 = ya.c(new j7.d(0, sb2.toString(), list), fVar.f18999a, this, false, true);
                ue.a aVar2 = ue.a.f27192u;
                if (c10 != aVar2) {
                    c10 = zVar;
                }
                if (c10 == aVar2) {
                    return aVar2;
                }
                return zVar;
            case 2:
                int i12 = this.f17545v;
                pe.z zVar2 = pe.z.f22715a;
                if (i12 != 0) {
                    if (i12 == 1) {
                        pe.a.e(obj);
                        return zVar2;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                j7.f fVar2 = (j7.f) this.f17546w;
                k7.c cVar = (k7.c) this.f17547x;
                this.f17545v = 1;
                Object c11 = ya.c(new androidx.ink.authoring.compose.d(fVar2, 8, cVar), fVar2.f18999a, this, false, true);
                ue.a aVar3 = ue.a.f27192u;
                if (c11 != aVar3) {
                    c11 = zVar2;
                }
                if (c11 == aVar3) {
                    return aVar3;
                }
                return zVar2;
            case 3:
                int i13 = this.f17545v;
                pe.z zVar3 = pe.z.f22715a;
                if (i13 != 0) {
                    if (i13 == 1) {
                        pe.a.e(obj);
                        return zVar3;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                j7.f fVar3 = (j7.f) this.f17546w;
                ArrayList arrayList = (ArrayList) this.f17547x;
                this.f17545v = 1;
                Object c12 = ya.c(new androidx.ink.authoring.compose.d(fVar3, 9, arrayList), fVar3.f18999a, this, false, true);
                ue.a aVar4 = ue.a.f27192u;
                if (c12 != aVar4) {
                    c12 = zVar3;
                }
                if (c12 == aVar4) {
                    return aVar4;
                }
                return zVar3;
            case 4:
                int i14 = this.f17545v;
                pe.z zVar4 = pe.z.f22715a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        pe.a.e(obj);
                        return zVar4;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                j7.l lVar = (j7.l) this.f17546w;
                ArrayList arrayList2 = (ArrayList) this.f17547x;
                this.f17545v = 1;
                Object c13 = ya.c(new androidx.ink.authoring.compose.d(lVar, 10, arrayList2), lVar.f19018a, this, false, true);
                ue.a aVar5 = ue.a.f27192u;
                if (c13 != aVar5) {
                    c13 = zVar4;
                }
                if (c13 == aVar5) {
                    return aVar5;
                }
                return zVar4;
            case 5:
                int i15 = this.f17545v;
                pe.z zVar5 = pe.z.f22715a;
                if (i15 != 0) {
                    if (i15 == 1) {
                        pe.a.e(obj);
                        return zVar5;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                j7.q qVar = (j7.q) this.f17546w;
                k7.i iVar = (k7.i) this.f17547x;
                this.f17545v = 1;
                Object c14 = ya.c(new androidx.ink.authoring.compose.d(qVar, 11, iVar), qVar.f19034a, this, false, true);
                ue.a aVar6 = ue.a.f27192u;
                if (c14 != aVar6) {
                    c14 = zVar5;
                }
                if (c14 == aVar6) {
                    return aVar6;
                }
                return zVar5;
            default:
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) this.f17547x;
                int i16 = this.f17545v;
                if (i16 != 0) {
                    if (i16 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    sf.h hVar2 = (sf.h) this.f17546w;
                    c4.s sVar = tf.c.f25716b;
                    Object obj2 = yVar.f19787u;
                    if (obj2 == sVar) {
                        obj2 = null;
                    }
                    this.f17545v = 1;
                    Object e = hVar2.e(obj2, this);
                    ue.a aVar7 = ue.a.f27192u;
                    if (e == aVar7) {
                        return aVar7;
                    }
                }
                yVar.f19787u = null;
                return pe.z.f22715a;
        }
    }
}
