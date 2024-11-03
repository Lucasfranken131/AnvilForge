package AnvilForge;

import java.util.HashMap;

public class Choice {
    static String nomeMod = "modtutorial";

    public static void returnChoice(int escolha, String nome) {
        HashMap<Integer, Runnable> criar = new HashMap<>();
        criar.put(1, () -> Choice.criarItemGenerico(nome));
        criar.put(2, () -> Choice.criarBloco(nome));
        criar.put(3, () -> Choice.criarFerramenta(nome));
        criar.put(4, () -> Choice.criarItem3D(nome));
        criar.getOrDefault(escolha, () -> System.out.println("Não foi")).run();
    }

    public static void criarItemGenerico(String nome) {
        CreateItem item = new CreateItem(nomeMod, nome);
        item.createGenericItem();
        System.out.println("Item criado.");
    }

    public static void criarBloco(String nome) {
        CreateBlock bloco = new CreateBlock(nomeMod, nome);
        bloco.createBlockItem();
        System.out.println("Bloco criado.");
    }

    public static void criarFerramenta(String nome) {
        CreateItem item = new CreateItem(nomeMod, nome);
        item.createToolItem();
        System.out.println("Item criado.");
    }

    public static void criarItem3D(String nome) {
        CreateItem item = new CreateItem(nomeMod, nome);
        item.create3DToolItem();
        System.out.println("Item criado.");
    }
}
