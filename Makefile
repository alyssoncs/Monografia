.PHONY: all clean cleanall

all:
	latexmk

continuous:
	latexmk -pvc

clean:
	latexmk -c

cleanall:
	latexmk -C
	rm -rf build/

