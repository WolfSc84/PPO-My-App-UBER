class Account:
    id = int;
    name = str;
    password = str;
    document = str;

    def __init__(self, name, document):
        super().__init__();
        self.name = name;
        self.document = document;