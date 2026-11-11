# Git/Git Bash Cheatsheet

### initial setup/cloning
navigate to your projects/git projects directory
```bash
cd <path-to-project-dir>
```
i.e. `cd ~/mai/git` # if there's spaces in the path use `\` to escape it or wrap path in ""

go to github and get the ssh link to clone the repo
```bash
git clone git@github.com:DebugT/oop_gorup_t.git
```

open the directory/folder
```bash
cd <repo-directory>
```
i.e. `cd oop_gorup_t`

switch to your feature branch
```bash
git checkout <feature-branch>
```
i.e. `git checkout andrei` use `git branch` to print the current branch for sanity check

### push changes to the branch 
check that only the files intended are changed
```bash
git status
```
choose files to be pushed to github
```bash
git add . # . means current directory, * means any changed files but not files starting with .name
```
can run `git status` again just to make sure all the files are highlighted in green and nothing in red unless you intend to

commit and add your message: describe what you have done/changed in the file etc
```bash
git commit -m "<your-message>" # replace everything inside the ""
```
now send all the changes to github
```bash
git push
```
do a final check in case a command was not typed properly
should display: nothing to commit, working tree clean
```bash
git status
```


### sync feature branch to main
make sure everything is pushed to your branch before this
```bash
git pull origin main
```

## conflicts
if there's a conflict the editor (vim) will open
the editor is pretty simple

press i to start editing under the cursor
press I to start editing from the start of the current line
> [!TIP]
> press Esc key to exit the insert mode

after entering a comment
type `:wq` this means command write quit
> [!WARNING]
> make sure the command above is typed exactly as above or there can be issues
