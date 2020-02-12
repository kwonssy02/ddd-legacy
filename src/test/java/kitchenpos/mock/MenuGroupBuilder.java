package kitchenpos.mock;

import kitchenpos.model.MenuGroup;

public class MenuGroupBuilder {
    private Long id;
    private String name;

    private MenuGroupBuilder() {};

    public static MenuGroupBuilder mock() {
        return new MenuGroupBuilder();
    }

    public MenuGroupBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public MenuGroupBuilder name(String name) {
        this.name = name;
        return this;
    }

    public MenuGroup build() {
        MenuGroup menuGroup = new MenuGroup();
        menuGroup.setId(id);
        menuGroup.setName(name);

        return menuGroup;
    }
}
