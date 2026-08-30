package b6;

/* loaded from: classes.dex */
public final class b extends g5.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1715a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1716b;

    public b(a6.r rVar) {
        rVar.getClass();
        this.f1716b = rVar;
    }

    @Override // g5.s
    public final void b(r5.c cVar) {
        int i = this.f1715a;
        cVar.getClass();
        switch (i) {
            case 0:
                cVar.f();
                try {
                    StringBuilder sb2 = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
                    ((a6.r) this.f1716b).getClass();
                    sb2.append(System.currentTimeMillis() - 86400000);
                    sb2.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                    cVar.o(sb2.toString());
                    cVar.w();
                    return;
                } finally {
                    cVar.m();
                }
            default:
                ((a1.f) this.f1716b).invoke(cVar);
                return;
        }
    }

    public b(a1.f fVar) {
        this.f1716b = fVar;
    }
}
