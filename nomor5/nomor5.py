def substr_count(string, substring):
    concurrences = 0

    for s in string:
        if s == substring:
            concurrences = concurrences + 1

    return concurrences

if __name__ == "__main__":
    print substr_count("bootcamp", "o")
