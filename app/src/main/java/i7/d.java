package i7;

import g5.s;

/* loaded from: classes.dex */
public final class d extends s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18333a;

    @Override // g5.s
    public void a(r5.c cVar) {
        switch (this.f18333a) {
            case 1:
                cVar.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                cVar.o("INSERT OR IGNORE INTO `stacks` (`id`, `title`, `orderIndex`, `createdAt`, `updatedAt`) VALUES ('stack-default', '', 0, " + currentTimeMillis + ", " + currentTimeMillis + ")");
                return;
            default:
                super.a(cVar);
                return;
        }
    }

    @Override // g5.s
    public void b(r5.c cVar) {
        switch (this.f18333a) {
            case 0:
                cVar.getClass();
                cVar.o("UPDATE OR IGNORE canvas_elements SET id = 'ink::' || notebookId || '::' || spreadIndex WHERE type = 'ink_layer' AND id NOT LIKE 'ink::%::%'");
                cVar.o("DELETE FROM canvas_elements WHERE type = 'ink_layer' AND id NOT LIKE 'ink::%::%'");
                return;
            default:
                super.b(cVar);
                return;
        }
    }
}
