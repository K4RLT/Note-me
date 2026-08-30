package j7;

import g5.v;
import pe.z;
import q.x;
import ya.c0;

/* loaded from: classes.dex */
public final class j extends ve.i implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19011u;

    /* renamed from: v, reason: collision with root package name */
    public int f19012v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f19013w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k7.f f19014x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, k7.f fVar, te.c cVar, int i) {
        super(1, cVar);
        this.f19011u = i;
        this.f19013w = lVar;
        this.f19014x = fVar;
    }

    @Override // ve.a
    public final te.c create(te.c cVar) {
        switch (this.f19011u) {
            case 0:
                return new j(this.f19013w, this.f19014x, cVar, 0);
            default:
                return new j(this.f19013w, this.f19014x, cVar, 1);
        }
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        te.c cVar = (te.c) obj;
        switch (this.f19011u) {
            case 0:
                return ((j) create(cVar)).invokeSuspend(z.f22715a);
            default:
                return ((j) create(cVar)).invokeSuspend(z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f19011u) {
            case 0:
                int i = this.f19012v;
                z zVar = z.f22715a;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                        return zVar;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                this.f19012v = 1;
                final l lVar = this.f19013w;
                v vVar = lVar.f19018a;
                final int i10 = 1;
                final k7.f fVar = this.f19014x;
                Object c10 = c0.c(new df.l() { // from class: j7.k
                    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
                    @Override // df.l
                    public final Object invoke(Object obj2) {
                        switch (i10) {
                            case 0:
                                p5.a aVar = (p5.a) obj2;
                                aVar.getClass();
                                lVar.f19019b.c(aVar, fVar);
                                return z.f22715a;
                            default:
                                k7.f fVar2 = fVar;
                                p5.a aVar2 = (p5.a) obj2;
                                aVar2.getClass();
                                eb.x xVar = lVar.f19020c;
                                p5.c T = aVar2.T("UPDATE OR ABORT `notebooks` SET `id` = ?,`title` = ?,`pageCount` = ?,`colorR` = ?,`colorG` = ?,`colorB` = ?,`orderIndex` = ?,`coverConfig` = ?,`backgroundConfig` = ?,`sizeId` = ?,`stackId` = ?,`createdAt` = ?,`updatedAt` = ? WHERE `id` = ?");
                                try {
                                    xVar.b(T, fVar2);
                                    T.P();
                                    ug.a.b(T, null);
                                    T = aVar2.T("SELECT changes()");
                                    try {
                                        T.P();
                                        T.getLong(0);
                                        ug.a.b(T, null);
                                        return z.f22715a;
                                    } finally {
                                    }
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                        }
                    }
                }, vVar, this, false, true);
                ue.a aVar = ue.a.f27192u;
                if (c10 != aVar) {
                    c10 = zVar;
                }
                if (c10 == aVar) {
                    return aVar;
                }
                return zVar;
            default:
                int i11 = this.f19012v;
                z zVar2 = z.f22715a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                        return zVar2;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                this.f19012v = 1;
                final l lVar2 = this.f19013w;
                v vVar2 = lVar2.f19018a;
                final int i12 = 0;
                final k7.f fVar2 = this.f19014x;
                Object c11 = c0.c(new df.l() { // from class: j7.k
                    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
                    @Override // df.l
                    public final Object invoke(Object obj2) {
                        switch (i12) {
                            case 0:
                                p5.a aVar2 = (p5.a) obj2;
                                aVar2.getClass();
                                lVar2.f19019b.c(aVar2, fVar2);
                                return z.f22715a;
                            default:
                                k7.f fVar22 = fVar2;
                                p5.a aVar22 = (p5.a) obj2;
                                aVar22.getClass();
                                eb.x xVar = lVar2.f19020c;
                                p5.c T = aVar22.T("UPDATE OR ABORT `notebooks` SET `id` = ?,`title` = ?,`pageCount` = ?,`colorR` = ?,`colorG` = ?,`colorB` = ?,`orderIndex` = ?,`coverConfig` = ?,`backgroundConfig` = ?,`sizeId` = ?,`stackId` = ?,`createdAt` = ?,`updatedAt` = ? WHERE `id` = ?");
                                try {
                                    xVar.b(T, fVar22);
                                    T.P();
                                    ug.a.b(T, null);
                                    T = aVar22.T("SELECT changes()");
                                    try {
                                        T.P();
                                        T.getLong(0);
                                        ug.a.b(T, null);
                                        return z.f22715a;
                                    } finally {
                                    }
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                        }
                    }
                }, vVar2, this, false, true);
                ue.a aVar2 = ue.a.f27192u;
                if (c11 != aVar2) {
                    c11 = zVar2;
                }
                if (c11 == aVar2) {
                    return aVar2;
                }
                return zVar2;
        }
    }
}
